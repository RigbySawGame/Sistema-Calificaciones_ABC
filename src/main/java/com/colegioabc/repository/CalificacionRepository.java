package com.colegioabc.repository;

import com.colegioabc.model.Calificacion;

import org.springframework.data.jpa.repository.JpaRepository;
	
	public interface CalificacionRepository extends JpaRepository<Calificacion, Long> {
	}
