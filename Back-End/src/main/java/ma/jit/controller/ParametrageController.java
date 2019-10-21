package ma.jit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ma.jit.entities.Parametrage;
import ma.jit.service.IParametrageService;

@RestController @CrossOrigin("*")
public class ParametrageController {
@Autowired
private IParametrageService ipar;

@RequestMapping(value="/parametrage", method=RequestMethod.GET)
public void parametrage(@RequestBody Parametrage par) {
	this.ipar.updateParam(par);
}
}
