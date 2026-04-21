package com.colegioabc.service;

import com.colegioabc.model.Calificacion;
import java.util.List;

public interface CalificacionService {
    List<Calificacion> listarTodos();
    Calificacion obtenerPorId(Long id);
    Calificacion guardar(Calificacion calificacion);
    void eliminar(Long id);
}
