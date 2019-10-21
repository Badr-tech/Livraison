package ma.jit.service;

import java.util.List;

import ma.jit.entities.Compte;

public interface ICompteService {
	
	public void create(Compte compte);
	public List<Compte> getAllCompte();
	public void deleteCompte(Long numeroCompte);
	public void updateCompte(Compte compte);
	public Compte  getCompteById(Long numeroCompte);
	public boolean retirerSolde(Long code, double montant) throws Exception;
	public void verserSolde(Long code, double montant);
	public void virementCaC(Long code1, Long code2, double montant);


}
