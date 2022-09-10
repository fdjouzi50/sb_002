package dz.ibnrochd.master14.business;

import java.util.List;

import org.springframework.stereotype.Service;

import dz.ibnrochd.master14.dao.ConsultationRepository;
import dz.ibnrochd.master14.model.Consultation;


@Service
public interface IConsultationService {
	public static final ConsultationRepository consultationRepo = null;

	public static List<Consultation> listeConsultations() {
		return consultationRepo.findAll();
	}

	public static void creerPatient(Consultation consultation) {
		consultationRepo.save(consultation);
	}

	public static void modifierPatient(Consultation consultation) {
		Consultation consult = consultationRepo.getOne(consultation.getId());
		
		consult.setMotif(consultation.getMotif());
		consult.setDateconsultation(consultation.getDateconsultation());
		
		consultationRepo.save(consult);
	}

	public static void supprimerconsultation(int id) {
		consultationRepo.deleteById(id);

}

}
