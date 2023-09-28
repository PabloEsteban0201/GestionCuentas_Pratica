package com.ejercicioBanco.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.ejercicioBanco.app.model.Prueba2;
import com.ejercicioBanco.app.repository.Prueba2Repository;


@Service
public class Prueba2ServiceImpl implements Prueba2Service {

	@Autowired
	private Prueba2Repository pruebaRepo;
	
	@Override
	@Transactional(readOnly=true)
	public Iterable<Prueba2> findAll() {
		
		return pruebaRepo.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Page<Prueba2> findAll(Pageable pageable) {
		
		return pruebaRepo.findAll(pageable);
	}

	@Override
	@Transactional(readOnly=true)
	public Optional<Prueba2> findById(Long id) {
		
		return pruebaRepo.findById(id);
	}

	@Override
	@Transactional
	public Prueba2 save(Prueba2 prueba) {
		
		return pruebaRepo.save(prueba);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		
		pruebaRepo.deleteById(id);
		
	}
	
}
