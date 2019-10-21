package ma.jit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import ma.jit.dao.IBackOfficeDao;
import ma.jit.entities.BackOffice;
import ma.jit.entities.Role;
@Service @CrossOrigin
public class BackOfficeService implements IBackOfficeService{
@Autowired
private IBackOfficeDao ibac;
	
	@Override
	public void create(BackOffice backoffice) {
		Role role = new Role();
		role.setId(3L);
		role.getListeUser().add(backoffice);
		backoffice.setRole(role);
		this.ibac.save(backoffice);
		
	}

	@Override
	public List<BackOffice> getAllClient() {
		return (List<BackOffice>) this.ibac.findAll();
	}

	@Override
	public void deleteBackOffice(Long id) {
		this.ibac.deleteById(id);
		
	}

	@Override
	public void updateBackOffice(BackOffice backoffice) {
		this.ibac.save(backoffice);
		
	}

	@Override
	public BackOffice getBackOfficeById(Long id) {
		return this.ibac.findById(id).get();
	}

}
