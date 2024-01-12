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

import com.example.demo.model.Person;
import com.example.demo.services.PersonService;

@RestController
@RequestMapping("/personas")
public class PersonREST {


	//Inyectamos la dependencia de la implementacion del servicio
	@Autowired
	@Qualifier("personaServiceImpl")
	private PersonService personService;
	
	
	@GetMapping("/listar_todos")
	private ResponseEntity<List<Person>> getAllPeople(){
		return ResponseEntity.ok(personService.listAllPeople());
	}
	
	@PostMapping("/add")
	private String add(@RequestBody Person persona){
		personService.addPerson(persona);
		return "";
	}
	
	@PostMapping("/update")
	private String edit(@RequestBody Person persona) {
		
		personService.updatePerson(persona);
		return "";
	}
	
	@GetMapping("/deleteById")
	private void delete(@RequestParam(name="cedula") int id) {//recupera el parametro enviado desde la vista
		personService.removePersonById(id);
	}
}
