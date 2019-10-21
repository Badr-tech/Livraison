package ma.jit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ma.jit.dao.IConseillerDao;
import ma.jit.entities.Conseiller;
import ma.jit.service.IConseillerService;

@RestController @CrossOrigin("*")
public class ConseillerRestWeb {

	@Autowired
	private IConseillerService conseil;

//listeclients
	@RequestMapping(value = "/conseillers", method = RequestMethod.GET)
	public List<Conseiller> getAllConseiller() {
		return conseil.getAllConseiller();
	}

//getclienybyid
	@RequestMapping(value = "/conseillers/{id}", method = RequestMethod.GET)
	public Conseiller getConseillerById(@PathVariable Long id) {
		return conseil.getConseillerById(id);

	}

	// ajouter client
	@RequestMapping(value = "/conseillers", method = RequestMethod.POST)
	public void saveClient(@RequestBody Conseiller conseiller) {
		conseil.create(conseiller);
	}

	// deletebyid
	@RequestMapping(value = "/conseillers/{id}", method = RequestMethod.DELETE)
	public boolean supprimer(@PathVariable Long id) {
		conseil.deleteConseiller(id);
		return true;
	}

	// updateclient
	@RequestMapping(value = "/conseillers/{id}", method = RequestMethod.PUT)
	public void saveConseiller(@RequestBody Conseiller conseiller) {
		conseil.updateConseiller(conseiller);

	}

}
