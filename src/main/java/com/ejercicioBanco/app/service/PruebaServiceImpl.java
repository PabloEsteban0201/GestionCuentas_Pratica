package com.ejercicioBanco.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.ejercicioBanco.app.model.Prueba;
import com.ejercicioBanco.app.repository.PruebaRepository;

@Service
public class PruebaServiceImpl implements PruebaService {

	@Autowired
	private PruebaRepository pruebaRepo;
	
	@Override
	@Transactional(readOnly=true)
	public Iterable<Prueba> findAll() {
		
		return pruebaRepo.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Page<Prueba> findAll(Pageable pageable) {
		
		return pruebaRepo.findAll(pageable);
	}

	@Override
	@Transactional(readOnly=true)
	public Optional<Prueba> findById(Long id) {
		
		return pruebaRepo.findById(id);
	}

	@Override
	@Transactional
	public Prueba save(Prueba prueba) {
		
		return pruebaRepo.save(prueba);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		
		pruebaRepo.deleteById(id);
		
	}
	
}
