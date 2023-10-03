package com.ejercicioBanco.app.controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejercicioBanco.app.dto.PruebaDto;
import com.ejercicioBanco.app.model.Prueba;
import com.ejercicioBanco.app.service.PruebaService;

@RestController
@RequestMapping("/prueba")
public class PruebaController {

	@Autowired
	private PruebaService pruebaService;
	
	@PostMapping
	public ResponseEntity<?> create(@RequestBody Prueba p){
		return ResponseEntity.status(HttpStatus.CREATED).body(pruebaService.save(p));
	}
	
	//Read a client
	@GetMapping("/{id}")
	public ResponseEntity<String> read(@PathVariable(value="id")Long pruebaId){
		Optional<Prueba> oPrue = pruebaService.findById(pruebaId);
		//Handle error
		if(!oPrue.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(oPrue.get().getDesc());
		
	}
	
	//Using DTO
	//Read a client with dto
	@GetMapping("/dtoprueba/{id}")
	public ResponseEntity<?> readPrueba(@PathVariable(value="id")Long pruebaId){
		Optional<Prueba> oPrue = pruebaService.findById(pruebaId);
		//Handle error
		if(!oPrue.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		final Prueba prueDB = oPrue.get();

		return ResponseEntity.ok(new PruebaDto(prueDB.getId(),prueDB.getDesc()));
		
	}
	
	//Update
	@PutMapping("/{id}")
	public ResponseEntity<?> update(@RequestBody Prueba pDetail, @PathVariable Long id){
		
		Optional<Prueba> prueba = pruebaService.findById(id);
		
		//Error
		if(!prueba.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		prueba.get().setDesc(pDetail.getDesc());
		
		
		return ResponseEntity.status(HttpStatus.CREATED).body(pruebaService.save(prueba.get()));
		
	}
	
	//Delete an user
	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable(value="id") Long id){
		
		if(!pruebaService.findById(id).isPresent()) {
			return ResponseEntity.notFound().build();
		}
		
		pruebaService.deleteById(id);
		return ResponseEntity.ok().build();
	}
	
	//Read all users
	@GetMapping
	public List<Prueba> readAll(){
		
		List<Prueba> users = StreamSupport.
				stream(pruebaService.findAll().spliterator(), false).
				collect(Collectors.toList());
		
		return users;
	}
	
	
	
}
