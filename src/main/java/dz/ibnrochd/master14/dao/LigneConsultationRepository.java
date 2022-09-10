package dz.ibnrochd.master14.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dz.ibnrochd.master14.model.LigneConsultation;
@Repository
public interface LigneConsultationRepository extends JpaRepository<LigneConsultation, Integer>{

}
