package com.dfa.gtf.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Asignatura {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String nombre;
	
	public Asignatura() {}
	
	
	public Asignatura(String nombre) {
		this.nombre = nombre;
	}
	
	/*Métodos de aceso*/
	
	public long getId() {
		return id;
	}
	
	public String nombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	
}
