package com.colegioabc.service;

import com.colegioabc.model.Profesor;
import java.util.List;

public interface ProfesorService {
    List<Profesor> listarTodos();
    Profesor obtenerPorId(Long id);
    Profesor guardar(Profesor profesor);
    void eliminar(Long id);
}
