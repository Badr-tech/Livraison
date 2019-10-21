package ma.jit.domaine;

import java.io.Serializable;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor
public class Conseiller extends Personne implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String email;
	private String adresse;
	/**
	 * @param id
	 * @param nom
	 * @param prenom
	 * @param email
	 * @param adresse
	 */
	public Conseiller(Long id, String nom, String prenom, String email, String adresse) {
		super(id, nom, prenom);
		this.email = email;
		this.adresse = adresse;
	}
	
	
}
