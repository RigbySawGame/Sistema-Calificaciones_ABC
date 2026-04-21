package com.colegioabc.service;

import com.colegioabc.model.Rol;
import java.util.List;

public interface RolService {
    List<Rol> listarTodos();
    Rol obtenerPorId(Long id);
    Rol guardar(Rol rol);
    void eliminar(Long id);
}
