package com.colegioabc.service;

import com.colegioabc.model.Estudiante;
import java.util.List;

public interface EstudianteService {
    List<Estudiante> listarTodos();
    Estudiante obtenerPorId(Long id);
    Estudiante guardar(Estudiante estudiante);
    void eliminar(Long id);
}
