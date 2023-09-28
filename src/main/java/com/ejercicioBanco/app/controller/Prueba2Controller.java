package com.ejercicioBanco.app.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.ejercicioBanco.app.model.Prueba2;
import com.ejercicioBanco.app.service.Prueba2Service;


@RestController
@RequestMapping("/prueba2")
public class Prueba2Controller {

	@Autowired
	private Prueba2Service pruebaService;
	
	@PostMapping
	public ResponseEntity<?> create(@RequestBody Prueba2 p){
		return ResponseEntity.status(HttpStatus.CREATED).body(pruebaService.save(p));
	}
	
	//Read a client
	@GetMapping("/{id}")
	public ResponseEntity<?> read(@PathVariable(value="id")Long pruebaId){
		Optional<Prueba2> oPrue = pruebaService.findById(pruebaId);
		
		//Handle error
		if(!oPrue.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(oPrue);
		
	}
}
