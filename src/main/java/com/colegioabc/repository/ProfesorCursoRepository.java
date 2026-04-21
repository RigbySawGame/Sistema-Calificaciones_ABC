package com.colegioabc.repository;

import com.colegioabc.model.ProfesorCurso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProfesorCursoRepository extends JpaRepository<ProfesorCurso, Long> {
    List<ProfesorCurso> findByProfesorId(Long profesorId);
    List<ProfesorCurso> findByCursoId(Long cursoId);
}