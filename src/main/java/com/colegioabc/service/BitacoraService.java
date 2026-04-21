package com.colegioabc.service;

import com.colegioabc.model.Bitacora;
import java.util.List;

public interface BitacoraService {
    List<Bitacora> listarTodos();
    Bitacora obtenerPorId(Long id);
    Bitacora guardar(Bitacora bitacora);
    void eliminar(Long id);
}
