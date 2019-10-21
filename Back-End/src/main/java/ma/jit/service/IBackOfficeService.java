package ma.jit.service;

import java.util.List;

import ma.jit.entities.BackOffice;


public interface IBackOfficeService {
	public void create(BackOffice backoffice);
public List<BackOffice> getAllClient();
public void deleteBackOffice (Long id);
public void updateBackOffice(BackOffice backoffice);
public BackOffice getBackOfficeById(Long id);
}

