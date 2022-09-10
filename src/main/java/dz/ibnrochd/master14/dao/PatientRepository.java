package dz.ibnrochd.master14.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import dz.ibnrochd.master14.model.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {
List<Patient> findByNom(String nom);
	
	@Query("select p from Patient p where p.nom = ?1")
	List<Patient> rechercheParNom(String  nom);
}
