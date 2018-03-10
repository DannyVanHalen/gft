package com.dfa.gtf.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dfa.gtf.entity.Alumno;


public interface AlumnoRepository extends JpaRepository<Alumno,Long> {

	Alumno findByTlf(String tlf);
	List<Alumno> findByNombre(String nombre);
	List<Alumno> findByApellido(String apellido);
	
}
