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

import com.ejercicioBanco.app.model.Cliente;
import com.ejercicioBanco.app.service.ClienteService;

@RestController
@RequestMapping("/api/clients")
public class ClienteController {
	
	@Autowired
	private ClienteService clientService;
	
	//Create a new client
	@PostMapping
	public ResponseEntity<?> create(@RequestBody Cliente client){
		return ResponseEntity.status(HttpStatus.CREATED).body(clientService.save(client));
	}
	
	//Read a client
	@GetMapping("/{id}")
	public ResponseEntity<?> read(@PathVariable(value="id")Long clientId){
		Optional<Cliente> oUser = clientService.findById(clientId);
		
		//Handle error
		if(!oUser.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(oUser);
		
	}
	
}
