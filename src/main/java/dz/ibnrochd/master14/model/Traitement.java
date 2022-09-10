package dz.ibnrochd.master14.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(schema = "cabinet", name = "traitement")
public class Traitement implements Serializable {

	private static final long serialVersionUID = 8248365590951840055L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nom", nullable = false, length = 255)
    private String nom;

    @OneToMany(mappedBy = "traitement")
    private List<LigneConsultation> ligne_consultation = new ArrayList<>();
    
    
/////////////////////////////////////////////////////////
    
    public Traitement() {		
	}

	public Traitement(int id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
	}
	
/////////////////////////////////////////////////////////

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<LigneConsultation> getLigne_consultation() {
		return ligne_consultation;
	}

	public void setLigne_consultation(List<LigneConsultation> ligne_consultation) {
		this.ligne_consultation = ligne_consultation;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
}
