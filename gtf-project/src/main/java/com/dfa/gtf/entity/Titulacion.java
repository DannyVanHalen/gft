package com.dfa.gtf.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Titulacion {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String nombre;
	
	/* Interrelaciones 
	 * 
	 * Titulacion puede tener muchas asignaturas 
	 * y una asignatura puede pertenecer a varias titulaciones
	 * 
	 * */
	
	@ManyToMany
	private List<Asignatura> asignaturas;
	
	
	
	public Titulacion() {}
	
	public Titulacion(String nombre,
			List<Asignatura> asignaturas) {
		this.nombre = nombre;
		this.asignaturas = asignaturas;
	}
	
	/*Métodos de Acceso*/
	
	public long getId() {
		return id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
}
