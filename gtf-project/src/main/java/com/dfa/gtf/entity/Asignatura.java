package com.dfa.gtf.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Asignatura {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String nombre;
	
	/*
	 * Interrelación Asignatura Alumnos N:M Bidireccional
	 */
	
	@ManyToMany(mappedBy="asignaturasAlumno")
	private List<Alumno> alumnos;
	
	
	/*
	 * Interrelación Asignatura Profesores N:M Bidireccional
	 */
	
	@ManyToMany(mappedBy="asignaturasProfesor")
	private List<Profesor> profesores;
	
	public Asignatura() {}
	
	
	public Asignatura(String nombre,
			List<Alumno> alumnos, List<Profesor> profesores) {
		this.nombre = nombre;
		this.alumnos = alumnos;
		this.profesores = profesores;
	}
	
	/*Métodos de aceso*/
	
	public long getId() {
		return id;
	}
	
	public String nombre() {
		return nombre;
	}
	
	public List<Alumno> getAlumnos() {
		return alumnos;
	}
	
	public List<Profesor> getProfesores() {
		return profesores;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setAlumnos(List<Alumno> alumnos) {
		this.alumnos = alumnos;
	}
	
	public void setProfesores(List<Profesor> profesores) {
		this.profesores = profesores;
	}
	
	/*Métodos Funcionales*/
	
	public boolean matricularAlumno(Alumno alumno) {
		return alumnos.add(alumno);
	}
	
	public boolean desmatricularAlumno(Alumno alumno) {
		return alumnos.remove(alumno);
	}
	
	public boolean asignarProfesor(Profesor profesor) {
		return profesores.add(profesor);
	}
	
	public boolean quitarProfesor(Profesor profesor) {
		return profesores.remove(profesor);
	}
}
