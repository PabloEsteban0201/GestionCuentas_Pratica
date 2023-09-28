package com.ejercicioBanco.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ejercicioBanco.app.model.Prueba;

@Repository
public interface PruebaRepository extends JpaRepository<Prueba, Long> {

}
