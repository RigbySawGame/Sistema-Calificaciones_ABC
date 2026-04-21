package com.colegioabc.repository;

import com.colegioabc.model.Asignatura;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AsignaturaRepository extends JpaRepository<Asignatura, Long> {
	
}
