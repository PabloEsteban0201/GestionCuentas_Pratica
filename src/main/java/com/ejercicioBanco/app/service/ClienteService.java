package com.ejercicioBanco.app.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.ejercicioBanco.app.model.Cliente;


public interface ClienteService {

	public Iterable<Cliente> findAll();
	
	public Page<Cliente> findAll(Pageable pageable);
	
	public Optional<Cliente> findById(Long id);
	
	public Cliente save(Cliente client);
	
	public void deleteById(Long id);
}
