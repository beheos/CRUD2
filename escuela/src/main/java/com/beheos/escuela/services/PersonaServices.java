package com.beheos.escuela.services;

import java.util.List;
import com.beheos.escuela.modelo.PersonaModelo;

public interface PersonaServices {
	
	
	List<PersonaModelo> listaPersona();
	void agregarPersona(PersonaModelo persona);
	void eliminarPersona(Integer idPersona);
	PersonaModelo buscarPersona(Integer idPersona);
	
	

}
