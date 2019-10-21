package ma.jit;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ma.jit.entities.Client;
import ma.jit.entities.Conseiller;
import ma.jit.entities.Role;
import ma.jit.service.IClientService;
import ma.jit.service.IConseillerService;

@SpringBootApplication
public class ProxiBanqueV4Application implements CommandLineRunner {
	@Autowired
	private IClientService clt;
	@Autowired
	private IConseillerService cons;

	public static void main(String[] args) {
		SpringApplication.run(ProxiBanqueV4Application.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		//Test
//		List<ObjectName> cons=new ArrayList<ObjectName>();
//		cons.add(new ObjectName("gerant"));
//		Role role = new Role("conseiller", cons );
		
		Role role = new Role(2L, "conseiller");
		
		clt.createClient(new Client("amer", "hind","hind@gmail.com", "sidimaarouf"),new Conseiller("baatouti", "badr","badr@gmail.com", "oulfa","hehe","hoho"));
		//cons.create(new Conseiller("baatouti", "badr","badr@gmail.com", "oulfa","hehe","hoho"));
//		cltDao.save(new Client("baatouti", "badr","badr@gmail.com", "oulfa"));
//		cltDao.save(new Client("hariri", "yassine","harharos@gmail.com", "hay salama"));
//		cltDao.save(new Client("quinouni", "issam","issamos@gmail.com", "hay hassani"));
//		cltDao.findAll().forEach(c->{
//		
//	System.out.println(c.getNom());
	};
}

