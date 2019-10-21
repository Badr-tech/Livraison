package ma.jit.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import ma.jit.entities.Compte;

public interface ICompteDao  extends JpaRepository<Compte, Long> {
	
	

}
