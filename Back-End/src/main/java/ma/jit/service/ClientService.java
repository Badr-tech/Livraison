package ma.jit.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import ma.jit.dao.IClientDao;
import ma.jit.dao.IParametrageDao;
import ma.jit.entities.Client;
import ma.jit.entities.CompteCourant;
import ma.jit.entities.Conseiller;
import ma.jit.entities.Parametrage;
@Service 
public class ClientService implements IClientService {
	@Autowired
	IClientDao clt;
	@Autowired
	IParametrageDao ipar;

	@Override
	public void createClient(Client client, Conseiller conseiller) throws Exception {
		List<Client> listClient = new ArrayList<Client>();
		//Parametrage par = ipar.findById(1L).get();
		//int maxCli = par.getMaxClients();
		//if(listClient.size()<maxCli) {
		listClient = conseiller.getListeClient();
		CompteCourant compte = new CompteCourant();
		compte.setSolde(20.00);
		compte.setDecouvert(200.00);
		compte.setClient(client);
		client.getListeCompte().add(compte);
		conseiller.getListeClient().add(client);
		client.setConseiller(conseiller);
		clt.save(client);//}
//		else {
//			throw new Exception("nombre maximum des clients atteint");
//		}

	}
	
	public void reafectConseiller(Client client, Conseiller conseiller) {
		client.getConseiller().getListeClient().remove(client);
		client.setConseiller(conseiller);
		conseiller.getListeClient().add(client);
	}

	@Override
	public List<Client> getAllClient() {
		return (List<Client>) clt.findAll();
	}

	@Override
	public void deleteClient(Long id) {
		clt.deleteById(id);
	}

	@Override
	public void updateClient(Client client) {
		clt.save(client);
	}

	@Override
	public Client getClientById(Long id) {

		return clt.findById(id).get();
	}

	@Override
	public Page<Client> chercherClient(String mc, Pageable pageable) {
		
		return clt.chercher(mc, pageable);
	}

}
