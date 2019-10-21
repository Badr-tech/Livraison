package ma.jit.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Client implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Declaration des attributs
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String prenom;
	private String email;
	private String adresse;

	public List<Compte> getListeCompte() {
		return listeCompte;
	}

	public void setListeCompte(List<Compte> listeCompte) {
		this.listeCompte = listeCompte;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Compte> listeCompte = new ArrayList<Compte>();

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JsonIgnore
	private Conseiller conseiller;
	/**
	 * Constructeur avec parametres
	 * 
	 * @param nom
	 * @param prenom
	 * @param email
	 * @param adresse
	 */
	public Client(String nom, String prenom, String email, String adresse) {
		super();
        
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.adresse = adresse;
		

	}

	/**
	 * Constructeur sans parametres
	 * 
	 */
	public Client() {
		super();
	}

	/**
	 * Getters Setters
	 * 
	 * @return
	 */
	public Long getId() {
		return id;
	}

	public Conseiller getConseiller() {
		return conseiller;
	}

	public void setConseiller(Conseiller conseiller) {
		this.conseiller = conseiller;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

}
