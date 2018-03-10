package com.dfa.gtf.entity;

import javax.persistence.Entity;

@Entity
public class Admin extends Usuario {

	public Admin() {}
	
	public Admin (String login, String maiLogin, String pass, String rol) {
		super(login,maiLogin,pass,rol);
	}
	
	/*Métodos de acceso heredados*/
	
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
	
}
