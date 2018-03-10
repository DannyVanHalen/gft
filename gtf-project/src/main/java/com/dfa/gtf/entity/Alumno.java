package com.dfa.gtf.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
public class Alumno extends Usuario {
	
	private String nombre;
	private String apellido;
	private String tlf;
	
	/*
	 * Interrelación Alumno-Asignatura N:M Bidireccional -> Entidad Principal
	 */
	
	@ManyToMany
	private List<Asignatura> asignaturasAlumno;
	
	
	public Alumno() {}
	
	public Alumno(String login, String maiLogin, String pass, String rol,
			String nombre, String apellido, String tlf,
			List<Asignatura> asignaturas) {
		
		super(login, maiLogin,pass,rol);
		this.nombre = nombre;
		this.apellido = apellido;
		this.tlf = tlf;
		
		this.asignaturasAlumno = asignaturas;
		
	}
	
	/* Métodos heredados de Usuario*/
	
	// GET 
		public long getId() {
			return super.getId();
		}
		
		public String getLogin() {
			return super.getLogin();
		}
		
		public String getMaiLogin() {
			return super.getMaiLogin();
		}
		
		public String getPass() {
			return super.getPass();
		}
		
		
		public String getRol() {
			return super.getRol();
		}
		
		// SET
		
		public void setLogin(String login) {
			super.setLogin(login);
		}
		
		public void setMaiLogin(String maiLogin) {
			super.setMaiLogin(maiLogin);
		}
		
		public void setPass(String pass) {
			super.setPass(pass);
		}
		
		public void setRol(String rol) {
			super.setRol(rol);
		}
	
		/* Métodos de acceso nativo **/
		
		public String getNombre() {
			return nombre;
		}
		
		public String getApellido() {
			return apellido;
		}
		
		public String getTlf() {
			return tlf;
		}
		
		// Interrelaciones
		public List<Asignatura> getAsignaturasAlumno() {
			return asignaturasAlumno;
		}
		
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		
		public void setApellido(String apellido) {
			this.apellido = apellido;
		}
		
		public void setTlf(String tlf) {
			this.tlf = tlf;
		}
		
		// Interrelaciones
		public void setAsignaturasAlumno(List<Asignatura> asignaturas) {
			this.asignaturasAlumno = asignaturas;
		}
		
		/*Métodos Funcionales*/
		public boolean agregarAsignatura(Asignatura asignatura) {
			return asignaturasAlumno.add(asignatura);
		}
		
		public boolean borrarAsignatura (Asignatura asignatura) {
			return asignaturasAlumno.remove(asignatura);
		}
		
		
		
}
