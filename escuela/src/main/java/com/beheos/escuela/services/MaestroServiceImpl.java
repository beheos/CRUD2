package com.beheos.escuela.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beheos.escuela.modelo.Persona;
import com.beheos.escuela.repository.PersonaRepository;

@Service
public class MaestroServiceImpl implements MaestroServices {

	@Autowired
	PersonaRepository maestroRepository;
	
	@Override
	public void agregar(Persona persona) {
		maestroRepository.save(persona);
		
	}

	
	

}
