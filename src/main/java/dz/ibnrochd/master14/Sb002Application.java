package dz.ibnrochd.master14;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import antlr.collections.List;
import dz.ibnrochd.master14.dao.ConsultationRepository;
import dz.ibnrochd.master14.dao.LigneConsultationRepository;
import dz.ibnrochd.master14.dao.PatientRepository;
import dz.ibnrochd.master14.dao.RendezVousRepository;
import dz.ibnrochd.master14.dao.TraitementRepository;
import dz.ibnrochd.master14.model.Consultation;
import dz.ibnrochd.master14.model.Patient;

@SpringBootApplication
public class Sb002Application implements CommandLineRunner {
	
	@Autowired
	PatientRepository patientRepository;
	LigneConsultationRepository ligne_consultationRepository;
	TraitementRepository traitementRepository;
	ConsultationRepository consultationRepository;
	RendezVousRepository rendezVousRepository;
	
	// TODO : déclarer les autres repository de la même façon que PatientRepository
	

	public static void main(String[] args) {
		SpringApplication.run(Sb002Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO : récupérer la liste de tous les patients puis afficher leurs noms
		patientRepository.findAll();
		System.out.println(patientRepository.getNom());
		
		// TODO : rechercher les patients ayant le nom "Yahi" puis leurs prénoms
		patientRepository.findByNom('Yahi');
		System.out.println((patientRepository.getPrenom());
		
		// TODO : créer un nouveau patient (valeurs au choix)  PUIS enregistrer-le
		patientRepository.save(new Patient("6", "fouad", "djouzi", "M", "1996-30-12", "0777777777", "Alger"));

				
		// TODO : rechercher la consultation ayant id=3 
		Optional<Consultation> cons = consultationRepository.findById(3);

		// TODO : parcourir les lignes de la consultation trouvée et afficher les noms des médicaments
		ligne_consultationRepository.traitement.cons.findByNom();
		System.out.println((traitementRepository.getNom());
		
	}

}
