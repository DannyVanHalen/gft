package com.dfa.gtf.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dfa.gtf.entity.Titulacion;


public interface TitualacionRepository extends JpaRepository<Titulacion,Long> {

	Titulacion findByNombre(String nombre);
	
}
