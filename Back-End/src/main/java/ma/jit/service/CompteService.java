package ma.jit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import ma.jit.dao.ICompteDao;
import ma.jit.entities.Compte;
@Service @CrossOrigin
public class CompteService implements ICompteService {

	@Autowired
	ICompteDao cpte;

	@Override
	public void create(Compte compte) {
		cpte.save(compte);
	}

	@Override
	public List<Compte> getAllCompte() {

		return (List<Compte>) cpte.findAll();
	}

	@Override
	public void deleteCompte(Long numeroCompte) {
		cpte.deleteById(numeroCompte);
	}

	@Override
	public void updateCompte(Compte compte) {
		cpte.save(compte);

	}

	@Override
	public Compte getCompteById(Long numeroCompte) {
		
	 return cpte.findById(numeroCompte).get();
	}

	@Override
	public void verserSolde(Long code, double montant) {
		double solde = cpte.findById(code).get().getSolde();
		cpte.findById(code).get().setSolde(solde+montant);	
	}

	@Override
	public boolean retirerSolde(Long code, double montant) throws Exception {
		boolean result = false;
		Compte compte = cpte.findById(code).get();
		double solde = compte.getSolde();
		if(solde-montant>compte.getDecouvert()) {
			compte.setSolde(solde-montant);
			result=true;
		}
		else {
			throw new Exception("Decouvert atteint");
			}
         return result;}

	@Override
	public void virementCaC(Long code1, Long code2, double montant) {
		try {
			retirerSolde(code1,montant);
		} catch (Exception e) {
			e.printStackTrace();
		}
		verserSolde(code2,montant);	
	}

}
