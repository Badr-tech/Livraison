package ma.jit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ma.jit.dao.IBackOfficeDao;
import ma.jit.entities.BackOffice;
import ma.jit.service.IBackOfficeService;

@RestController @CrossOrigin("*")
public class BackOfficeRestWeb {

	@Autowired
	private IBackOfficeService bo;

//listeclients
	@RequestMapping(value = "/backoffices", method = RequestMethod.GET)
	public List<BackOffice> getAllbackoffice() {
		return bo.getAllClient();
	}

//getclienybyid
	@RequestMapping(value = "/backoffices/{id}", method = RequestMethod.GET)
	public BackOffice getbackofficeById(@PathVariable Long id) {
		return bo.getBackOfficeById(id);

	}

	// ajouter client
	@RequestMapping(value = "/backoffices", method = RequestMethod.POST)
	public void saveClient(@RequestBody BackOffice backoffice) {
		bo.create(backoffice);
	}

	// deletebyid
	@RequestMapping(value = "/backoffices/{id}", method = RequestMethod.DELETE)
	public boolean supprimer(@PathVariable Long id) {
		bo.deleteBackOffice(id);
		return true;
	}

	// updateclient
	@RequestMapping(value = "/backoffices/{id}", method = RequestMethod.PUT)
	public void savebackoffice(@RequestBody BackOffice backoffice) {
		bo.updateBackOffice(backoffice);

	}

}
