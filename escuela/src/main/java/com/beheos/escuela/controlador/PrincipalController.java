package com.beheos.escuela.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.beheos.escuela.modelo.Alumno;
import com.beheos.escuela.modelo.Persona;
import com.beheos.escuela.services.AlumnoServices;

@Controller
public class PrincipalController {
	
	@Autowired
	AlumnoServices alumnoServices;
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String mostrarPrincipal() {
		return "escuela";
	}
	
	/*@PostMapping(value = "/guardarAlumno")
	public String guardarAlumno() {
		Persona persona = new Alumno();
		persona.setNombre("oscar");
		persona.setPaterno("hernandez");
		persona.setMaterno("bello");
		persona.setCorreo("oscar@gmail.com");
		alumnoServices.agregar(persona);
		return "escuela";
	}*/

}
