package dz.ibnrochd.master14.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dz.ibnrochd.master14.model.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {
List<Patient> findById(int id);
List<Patient> findAll();
List<Patient> findByNom();
List<Patient> findByPrenom();
}
