package com.colegioabc.repository;

import com.colegioabc.model.Evaluacion;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EvaluacionRepository extends JpaRepository<Evaluacion, Long> {
}