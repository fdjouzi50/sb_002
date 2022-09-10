package dz.ibnrochd.master14.business;

import java.util.List;

import org.springframework.stereotype.Service;

import dz.ibnrochd.master14.dao.PatientRepository;
import dz.ibnrochd.master14.model.Patient;

@Service
public interface IPatientService {
	public static final PatientRepository patientRepo = null;

	public static List<Patient> listePatients() {
		return patientRepo.findAll();
	}

	public static void creerPatient(Patient patient) {
		patientRepo.save(patient);
	}

	public static void modifierPatient(Patient patient) {
		Patient pat = patientRepo.getOne(patient.getId());
		
		pat.setNom(patient.getNom());
		pat.setPrenom(patient.getPrenom());
		pat.setDateNaissance(patient.getDateNaissance());
		pat.setSexe(patient.getSexe());
		pat.setNumeroTelephone(patient.getNumeroTelephone());
		pat.setAdresse(patient.getAdresse());
		
		
		patientRepo.save(pat);
	}

	public static void supprimerPatient(int id) {
		patientRepo.deleteById(id);

}
}
