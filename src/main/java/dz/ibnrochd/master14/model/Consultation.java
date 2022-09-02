package dz.ibnrochd.master14.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(schema = "cabinet", name = "consultation")
public class Consultation implements Serializable {

	private static final long serialVersionUID = -3669998604878710274L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "motif", nullable = false, length = 255)
    private String motif;
    
    @Column(name = "date_consultation", nullable = false, length = 255)
    private String dateconsultation;
    
    @ManyToOne()
    @JoinColumn(name = "id_patient", nullable = false)
    private Patient patient;

    @OneToMany(mappedBy = "consultation")
    private List<LigneConsultation> ligne_consultation = new ArrayList<>();
    
    @ManyToMany
    @JoinColumn(name = "traitement", nullable = false)
    private Traitement traitement;
    
/////////////////////////////////////////////////////////
    
    public Consultation() {		
	}

	public Consultation(int id, String motif, String dateconsultation) {
		this.id = id;
		this.motif = motif;
		this.dateconsultation = dateconsultation;
		
	}
	
/////////////////////////////////////////////////////////

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMotif() {
		return motif;
	}

	public void setMotif(String motif) {
		this.motif = motif;
	}

	public String getDateconsultation() {
		return dateconsultation;
	}

	public void setDateconsultation(String dateconsultation) {
		this.dateconsultation = dateconsultation;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public List<LigneConsultation> getLigne_consultation() {
		return ligne_consultation;
	}

	public void setLigne_consultation(List<LigneConsultation> ligne_consultation) {
		this.ligne_consultation = ligne_consultation;
	}

	public Traitement getTraitement() {
		return traitement;
	}

	public void setTraitement(Traitement traitement) {
		this.traitement = traitement;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

    
}
