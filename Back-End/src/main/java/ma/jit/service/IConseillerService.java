package ma.jit.service;

import java.util.List;

import ma.jit.entities.Conseiller;

public interface IConseillerService {
	public void create(Conseiller conseiller);
	public List<Conseiller> getAllConseiller();
	public void deleteConseiller (Long id);
	public void updateConseiller(Conseiller conseiller);
	public Conseiller getConseillerById(Long id);


}
