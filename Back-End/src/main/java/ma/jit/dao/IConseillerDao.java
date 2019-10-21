package ma.jit.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.jit.entities.Conseiller;

public interface IConseillerDao extends JpaRepository<Conseiller, Long> {

}
