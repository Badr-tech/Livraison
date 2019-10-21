package ma.jit.entities;

import javax.persistence.Entity;

@Entity
public class BackOffice extends User{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BackOffice() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BackOffice(String nom, String prenom, String login, String password, String adresse, String email) {
		super(nom, prenom, login, password, adresse, email);
		// TODO Auto-generated constructor stub
	}
	
	

}
