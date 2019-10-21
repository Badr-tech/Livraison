package ma.jit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ma.jit.entities.Client;
import ma.jit.entities.Conseiller;
import ma.jit.service.IClientService;

@RestController @CrossOrigin("*")
public class ClientsRestWeb {

	@Autowired
	private IClientService clt;

//listeclients
	@RequestMapping(value = "/clients", method = RequestMethod.GET)
	public List<Client> getAllClient() {
		return clt.getAllClient();
	}

//getclienybyid
	@RequestMapping(value = "/clients/{id}", method = RequestMethod.GET)
	public Client getClientById(@PathVariable Long id) {
		return clt.getClientById(id);

	}

	// ajouter client
	@RequestMapping(value = "/clients", method = RequestMethod.POST)
	public void saveClient(@RequestBody Client client, Conseiller conseiller) throws Exception {
		clt.createClient(client, conseiller);
	}

	// deletebyid
	@RequestMapping(value = "/clients/{id}", method = RequestMethod.DELETE)
	public void supprimer(@PathVariable Long id) {
		clt.deleteClient(id);
	}

	// updateclient
	@RequestMapping(value = "/clients", method = RequestMethod.PUT)
	public void updateClient(@RequestBody Client client) {
		clt.updateClient(client);

	}
	@RequestMapping(value = "/chercherClients", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public Page<Client> chercherClient(
			@RequestParam(name = "mc",defaultValue = "")String mc, 
			@RequestParam(name = "page",defaultValue = "0")int page, 
			@RequestParam(name = "size",defaultValue = "5")int size){
		return clt.chercherClient("%"+mc+"%", new PageRequest(page, size));
	}

}
