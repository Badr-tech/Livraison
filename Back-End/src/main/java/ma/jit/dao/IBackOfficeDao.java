package ma.jit.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.jit.entities.BackOffice;

public interface IBackOfficeDao extends JpaRepository<BackOffice,Long>{

}
