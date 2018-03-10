package com.dfa.gtf.entity;

import javax.persistence.Entity;

@Entity
public class Alumno extends Usuario {
	
	private String nombre;
	private String apellido;
	private String tlf;
	
	
	public Alumno() {}
	
	public Alumno(String login, String maiLogin, String pass, String rol,
			String nombre, String apellido, String tlf) {
		super(login, maiLogin,pass,rol);
		this.nombre = nombre;
		this.apellido = apellido;
		this.tlf = tlf;
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
		
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		
		public void setApellido(String apellido) {
			this.apellido = apellido;
		}
		
		public void setTlf(String tlf) {
			this.tlf = tlf;
		}
}
