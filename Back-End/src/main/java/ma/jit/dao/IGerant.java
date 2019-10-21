package ma.jit.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.jit.entities.Gerant;

public interface IGerant extends JpaRepository<Gerant, Long>{

}
