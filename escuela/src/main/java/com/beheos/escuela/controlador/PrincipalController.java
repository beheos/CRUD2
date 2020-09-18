package com.beheos.escuela.controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.beheos.escuela.modelo.PersonaModelo;
import com.beheos.escuela.services.PersonaServices;
import com.google.gson.Gson;


@Controller
public class PrincipalController {
	
	@Autowired
	PersonaServices personaServices;
	
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String mostrarPrincipal(Model model) {
		List<PersonaModelo>lista = personaServices.listaPersona();
		model.addAttribute("personas", lista);
		return "escuela";
	}
	
	@PostMapping(value = "/guardarPersona")
	public String guardarAlumno(PersonaModelo persona) {
		personaServices.agregarPersona(persona);
		return "redirect:/";
	}

	@PostMapping(value="/eliminarPersona/{id}")
	public String EliminarPersona(@PathParam("id")Integer id) {
		personaServices.eliminarPersona(id);
		return "redirect:/";
	}
	
	@GetMapping(value="/modificar/{id}")
		public void modificar(@PathParam("id")Integer id, HttpServletResponse response) throws IOException {
			PersonaModelo persona = personaServices.buscarPersona(id);
			Gson gson = new Gson();
			PrintWriter writer = response.getWriter();
			writer.print(gson.toJson(persona));
			writer.flush();
			writer.close();
		}
	
}
