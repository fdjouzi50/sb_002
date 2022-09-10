package dz.ibnrochd.master14.business;

import java.util.List;

import org.springframework.stereotype.Service;

import dz.ibnrochd.master14.dao.TraitementRepository;
import dz.ibnrochd.master14.model.Traitement;

@Service
public interface ITraitementService {
	public static final TraitementRepository traitementRepo = null;

	public static List<Traitement> listeTraitements() {
		return traitementRepo.findAll();
	}

	public static void creerTraitement(Traitement traitement) {
		traitementRepo.save(traitement);
	}

	public static void modifierTraitement(Traitement traitement) {
		Traitement trait = traitementRepo.getOne(traitement.getId());
		
		trait.setNom(traitement.getNom());
		
		
		traitementRepo.save(trait);
	}

	public static void supprimerTraitement(int id) {
		traitementRepo.deleteById(id);

}

}
