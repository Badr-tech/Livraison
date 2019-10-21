package ma.jit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import ma.jit.dao.IParametrageDao;
import ma.jit.entities.Parametrage;
@Service @CrossOrigin
public class ParametrageService implements IParametrageService{

	@Autowired
	private IParametrageDao iback;

	@Override
	public void updateParam(Parametrage param) {
    this.iback.save(param);
	}
	


}
