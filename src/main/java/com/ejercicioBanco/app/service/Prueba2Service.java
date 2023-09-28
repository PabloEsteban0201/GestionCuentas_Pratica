package com.ejercicioBanco.app.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import com.ejercicioBanco.app.model.Prueba2;

public interface Prueba2Service {
	
	public Iterable<Prueba2> findAll();
	
	public Page<Prueba2> findAll(Pageable pageable);
	
	public Optional<Prueba2> findById(Long id);
	
	public Prueba2 save(Prueba2 prueba);
	
	public void deleteById(Long id);
	
}
