package ma.jit.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;

import ma.jit.entities.Client;
import ma.jit.entities.Conseiller;

public interface IClientService {
	
		
		public void createClient(Client client, Conseiller conseiller) throws Exception;
		public List<Client> getAllClient();
		public void deleteClient(Long id);
		public void updateClient(Client client);
		public Client  getClientById(Long id);
		public Page<Client> chercherClient(String mc, Pageable pageable);


	}
