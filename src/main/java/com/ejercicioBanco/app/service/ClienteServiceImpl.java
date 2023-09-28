package com.ejercicioBanco.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ejercicioBanco.app.model.Cliente;
import com.ejercicioBanco.app.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService{

	//Dependency injection
	@Autowired
	private ClienteRepository clienteRepo;
	
	@Override
	@Transactional(readOnly=true)
	public Iterable<Cliente> findAll() {
		
		return clienteRepo.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Page<Cliente> findAll(Pageable pageable) {
		
		return clienteRepo.findAll(pageable);
	}

	@Override
	@Transactional(readOnly=true)
	public Optional<Cliente> findById(Long id) {
		
		return clienteRepo.findById(id);
	}

	@Override
	@Transactional
	public Cliente save(Cliente client) {
		
		return clienteRepo.save(client);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		
		clienteRepo.deleteById(id);
		
	}

}
