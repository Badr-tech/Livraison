package ma.jit.domaine;

import javax.persistence.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor 
public class Client extends Personne {

	private String email;
	private String adresse;
	/**
	 * @param id
	 * @param nom
	 * @param prenom
	 * @param email
	 * @param adresse
	 */
	public Client(Long id, String nom, String prenom, String email, String adresse) {
		super(id, nom, prenom);
		this.email = email;
		this.adresse = adresse;
	}
	

	

}
