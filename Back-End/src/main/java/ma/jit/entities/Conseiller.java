package ma.jit.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;


@Entity

public class Conseiller extends User {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Client> listeClient = new ArrayList<Client>();

	public List<Client> getListeClient() {
		return listeClient;
	}

	public void setListeClient(List<Client> listeClient) {
		this.listeClient = listeClient;
	}

	public Conseiller() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Conseiller(String nom, String prenom, String login, String password, String adresse, String email) {
		super(nom, prenom, login, password, adresse, email);
		// TODO Auto-generated constructor stub
	}

}
