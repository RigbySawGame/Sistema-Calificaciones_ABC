package com.colegioabc.service;

import com.colegioabc.model.Curso;
import java.util.List;

public interface CursoService {
    List<Curso> listarTodos();
    Curso obtenerPorId(Long id);
    Curso guardar(Curso curso);
    void eliminar(Long id);
}
