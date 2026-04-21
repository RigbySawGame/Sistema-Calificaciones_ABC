package com.colegioabc.service;

import com.colegioabc.model.Evaluacion;
import java.util.List;

public interface EvaluacionService {
    List<Evaluacion> listarTodos();
    Evaluacion obtenerPorId(Long id);
    Evaluacion guardar(Evaluacion evaluacion);
    void eliminar(Long id);
}
