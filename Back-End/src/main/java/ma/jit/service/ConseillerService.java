package ma.jit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import ma.jit.dao.IConseillerDao;
import ma.jit.entities.Conseiller;
import ma.jit.entities.Role;
@Service @CrossOrigin
public class ConseillerService implements IConseillerService {

	@Autowired
	IConseillerDao conseil;
	
	@Override
	public void create(Conseiller conseiller) {
	Role role = new Role();
	role.setId(2L);
	role.getListeUser().add(conseiller);
	conseiller.setRole(role);
	conseil.save(conseiller);
		
	}

	@Override
	public List<Conseiller> getAllConseiller() {
		
		return (List<Conseiller>) conseil.findAll();
	}

	@Override
	public void deleteConseiller(Long id) {
		conseil.deleteById(id);
		
	}

	@Override
	public void updateConseiller(Conseiller conseiller) {
		conseil.save(conseiller);
		
	}

	@Override
	public Conseiller getConseillerById(Long id) {
		
		return conseil.findById(id).get();
	}

}
