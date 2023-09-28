package com.ejercicioBanco.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ejercicioBanco.app.model.Prueba2;

@Repository
public interface Prueba2Repository extends JpaRepository<Prueba2, Long> {

}
