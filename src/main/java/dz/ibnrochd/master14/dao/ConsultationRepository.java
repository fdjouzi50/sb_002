package dz.ibnrochd.master14.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import dz.ibnrochd.master14.model.Consultation;

public interface ConsultationRepository extends JpaRepository<Consultation, Integer> {
	List<Consultation> findById(int id);
	List<Consultation> findAll();

}
