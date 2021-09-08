package com.example.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Persona;
import com.example.demo.services.PersonaService;

@RestController
@RequestMapping("/personas")
public class PersonaREST {


	//Inyectamos la dependencia de la implementacion del servicio
	@Autowired
	@Qualifier("personaServiceImpl")
	private PersonaService personaService;
	
	
	@GetMapping("/listar_todos")
	private ResponseEntity<List<Persona>> getAllPeople(){
		return ResponseEntity.ok(personaService.listAllPeople());
	}
	
	@PostMapping("/add")
	private String agregar(@RequestBody Persona persona){
		personaService.addPersona(persona);
		return "";
	}
	
	@PostMapping("/update")
	private String editar(@RequestBody Persona persona) {
		
		personaService.updatePersona(persona);
		return "";
	}
	
	@GetMapping("/deleteById")
	private void borrar(@RequestParam(name="cedula") int cedula) {//recupera el parametro enviado desde la vista
		personaService.removePersonaById(cedula);
	}
}
