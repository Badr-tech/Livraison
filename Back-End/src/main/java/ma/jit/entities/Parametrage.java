package ma.jit.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Parametrage{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long id;
	private int maxCons;
	private int maxClients;
	private int com;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getMaxCons() {
		return maxCons;
	}
	public void setMaxCons(int maxCons) {
		this.maxCons = maxCons;
	}
	public int getMaxClients() {
		return maxClients;
	}
	public void setMaxClients(int maxClients) {
		this.maxClients = maxClients;
	}
	public int getCom() {
		return com;
	}
	public void setCom(int com) {
		this.com = com;
	}
	public Parametrage(Long id, int maxCons, int maxClients, int com) {
		super();
		this.id = id;
		this.maxCons = maxCons;
		this.maxClients = maxClients;
		this.com = com;
	}
	public Parametrage() {
		super();
	}
	





}
