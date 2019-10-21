package ma.jit.service;

import ma.jit.entities.Gerant;

public interface IGerantService {
	
public void createGerant(Gerant gerant);
public void updateGerant(Gerant gerant);
public void getGerantById(Long id);
public void deleteGerant(Long id);

}
