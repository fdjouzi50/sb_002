package dz.ibnrochd.master14.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import dz.ibnrochd.master14.business.IConsultationService;
import dz.ibnrochd.master14.business.IPatientService;
import dz.ibnrochd.master14.business.ITraitementService;
import dz.ibnrochd.master14.model.Patient;
import dz.ibnrochd.master14.model.Traitement;

public class Controller {
	@Autowired
	private IPatientService patientService;
	private ITraitementService traitementService;
	private IConsultationService consultationService;

	@GetMapping(value = { "/patients" })
	public String index(Model model) {
		model.addAttribute("data", IPatientService.listePatients());
		return "liste";
	}

	@PostMapping(value = "/patients/{id}")
	public String supprimer(Model model, @PathVariable("id") String id) {
		try {
			IPatientService.supprimerPatient(Integer.parseInt(id));
			return "redirect:/patients";
		} catch (Exception ex) {
			model.addAttribute("message", ex.getMessage());
			return "liste";
		}
	}

	@GetMapping(value = { "/patients/ajouter" })
	public String nouveau(Model model) {
		model.addAttribute("patient", new Patient());
		return "ajouter";
	}

	@PostMapping(value = { "/patients/ajouter" })
	public String ajouter(Model model, @ModelAttribute("patient") Patient patient) {
		try {
			IPatientService.creerPatient(patient);
			return "redirect:/patients";
		} catch (Exception ex) {
			model.addAttribute("message", ex.getMessage());
			return "ajouter";
		}
	}

	@GetMapping(value = { "/patients/modifier" })
	public String editer(Model model) {
		model.addAttribute("patient", new Patient());
		return "ajouter";
	}

	@PostMapping(value = { "/patients/modifier" })
	public String modifier(Model model, @ModelAttribute("patient") Patient patient) {
		try {
			IPatientService.modifierPatient(patient);
			return "redirect:/patients";
		} catch (Exception ex) {
			model.addAttribute("message", ex.getMessage());
			return "ajouter";
		}
	}
	////////////////////////////////////////////////////////////////////////////////
	
	@GetMapping(value = { "/traitements" })
	public String index1(Model model) {
		model.addAttribute("data", ITraitementService.listeTraitements());
		return "liste";
	}

	@PostMapping(value = "/traitements/{id}")
	public String supprimer1(Model model, @PathVariable("id") String id) {
		try {
			ITraitementService.supprimerTraitement(Integer.parseInt(id));
			return "redirect:/traitements";
		} catch (Exception ex) {
			model.addAttribute("message", ex.getMessage());
			return "liste";
		}
	}

	@GetMapping(value = { "/traitements/ajouter" })
	public String nouveau1(Model model) {
		model.addAttribute("traitements", new Traitement());
		return "ajouter";
	}

	@PostMapping(value = { "/traitements/ajouter" })
	public String ajouter(Model model, @ModelAttribute("traitements") Traitement traitement) {
		try {
			ITraitementService.creerTraitement(traitement);
			return "redirect:/patients";
		} catch (Exception ex) {
			model.addAttribute("message", ex.getMessage());
			return "ajouter";
		}
	}

	@GetMapping(value = { "/traitements/modifier" })
	public String editer1(Model model) {
		model.addAttribute("traitement", new Traitement());
		return "ajouter";
	}

	@PostMapping(value = { "/traitements/modifier" })
	public String modifier(Model model, @ModelAttribute("traitement") Traitement traitement) {
		try {
			ITraitementService.modifierTraitement(traitement);
			return "redirect:/traitements";
		} catch (Exception ex) {
			model.addAttribute("message", ex.getMessage());
			return "ajouter";
		}
	}
}
