package ma.jit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ma.jit.domaine.Conseiller;
import ma.jit.service.IConseillerService;

@RestController @CrossOrigin
public class ConseillerController {
	@Autowired
	IConseillerService conseillerService;
	
	@RequestMapping(value =  "/conseillers", method = RequestMethod.GET )
	public List<Conseiller> getAll(){
		return conseillerService.getAll();
	}
	
	@RequestMapping(value = "/conseillers", method = RequestMethod.POST)
	public void create(@RequestBody Conseiller conseiller) {
		conseillerService.create(conseiller);
	}

}
