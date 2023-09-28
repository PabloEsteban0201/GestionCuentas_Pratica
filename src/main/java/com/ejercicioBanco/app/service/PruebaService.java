package com.ejercicioBanco.app.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.ejercicioBanco.app.model.Prueba;

public interface PruebaService {
	
	public Iterable<Prueba> findAll();
	
	public Page<Prueba> findAll(Pageable pageable);
	
	public Optional<Prueba> findById(Long id);
	
	public Prueba save(Prueba prueba);
	
	public void deleteById(Long id);
	
}
