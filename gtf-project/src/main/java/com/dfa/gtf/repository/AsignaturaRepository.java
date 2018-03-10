package com.dfa.gtf.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dfa.gtf.entity.Asignatura;

public interface AsignaturaRepository extends JpaRepository<Asignatura,Long> {

	Asignatura findByNombre(String nombre);
	
}
