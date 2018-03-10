package com.dfa.gtf.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dfa.gtf.entity.Profesor;

public interface ProfesorRepository extends JpaRepository<Profesor,Long>{

	Profesor findByTlf(String tlf);
	List<Profesor> findByNombre(String nombre);
	List<Profesor> findByApellido(String apellido);
	
}
