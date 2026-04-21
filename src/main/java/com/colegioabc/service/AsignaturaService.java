package com.colegioabc.service;

import com.colegioabc.model.Asignatura;
import java.util.List;

public interface AsignaturaService {
    List<Asignatura> listarTodos();
    Asignatura obtenerPorId(Long id);
    Asignatura guardar(Asignatura asignatura);
    void eliminar(Long id);
}
