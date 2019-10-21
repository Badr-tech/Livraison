package ma.jit.controller;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;

import ma.jit.service.ICompteService;

@Path("/virements") @CrossOrigin("*")
public class Virement extends Application{
@Autowired
ICompteService ico;

@GET
@Path("/versement")
public void verser(@PathParam("code") Long code,@PathParam("montant") double montant) {
	ico.verserSolde(code, montant);
}

@GET
@Path("/retirer")
public void retirer(@PathParam("code") Long code,@PathParam("montant") double montant) throws Exception {
	ico.retirerSolde(code, montant);
}

@GET
@Path("/virement")
public void virement(@PathParam("code1") Long code1,@PathParam("code2") long code2, @PathParam("montant") double montant) {
	ico.virementCaC(code1, code2, montant);
}
	
}
