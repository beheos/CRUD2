package com.beheos.escuela.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.beheos.escuela.modelo.PersonaModelo;
import com.beheos.escuela.repository.PersonaRepository;



@Service
public class PersonaServiceImpl implements PersonaServices {

	@Autowired
	PersonaRepository personaRepository;
	
	

	
	@Override
	public void agregarPersona(PersonaModelo persona) {
		personaRepository.save(persona);
		
	}


	@Override
	public List<PersonaModelo> listaPersona() {
		return personaRepository.findAll();
	}


	@Override
	public void eliminarPersona(Integer idPersona) {
		personaRepository.deleteById(idPersona);
		
	}


	@Override
	public PersonaModelo buscarPersona(Integer idPersona) {
		return personaRepository.findById(idPersona).orElse(null);
	}


}
