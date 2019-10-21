package ma.jit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ma.jit.dao.ICompteDao;
import ma.jit.entities.Compte;
import ma.jit.service.ICompteService;
@Controller @CrossOrigin("*")
public class CompteRestWeb {
	@Autowired
	private ICompteService cpte;

//listeclients
	@RequestMapping(value = "/comptes", method = RequestMethod.GET)
	public List<Compte> getAllCompte() {
		return cpte.getAllCompte();
	}

//getclienybyid
	@RequestMapping(value = "/comptes/{numeroCompte}", method = RequestMethod.GET)
	public Compte getCompteById(@PathVariable Long numeroCompte) {
		return cpte.getCompteById(numeroCompte);

	}

	// ajouter client
	@RequestMapping(value = "/comptes", method = RequestMethod.POST)
	public void saveCompte(@RequestBody Compte compte) {
		 cpte.create(compte);
	}

	//deletebyid
		@RequestMapping(value = "/comptes/{numeroCompte}", method = RequestMethod.DELETE)
		public boolean supprimer(@PathVariable Long numeroCompte) {
			cpte.deleteCompte(numeroCompte);;
			return true;
		}
		
		//updateclient
				@RequestMapping(value = "/comptes", method = RequestMethod.PUT)
				public void save(@RequestBody Compte compte ) {
					cpte.updateCompte(compte);
					
				}	
	
}
