package com.dfa.gtf.services;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dfa.gtf.entity.Admin;
import com.dfa.gtf.repository.UsuarioRepository;

@Component
public class DBLoader {

	@Autowired
	private UsuarioRepository usuarios;
	
	
	@PostConstruct
	public void initDB() {
		
		if(usuarios.findByLogin("root") == null) {
			usuarios.save(new Admin("root","urjc.academy.root@gmail.com","sudosu12345@","administrador"));
		}
		
	
	}
}
