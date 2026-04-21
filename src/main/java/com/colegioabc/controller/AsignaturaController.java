package com.colegioabc.controller;

import com.colegioabc.model.Asignatura;
import com.colegioabc.service.AsignaturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/asignaturas")
@CrossOrigin(origins = "*")

public class AsignaturaController {

    @Autowired
    private AsignaturaService asignaturaService;

    @GetMapping
    public List<Asignatura> listarTodos() {
        return asignaturaService.listarTodos();
    }

    @GetMapping("/{id}")
    public Asignatura obtenerPorId(@PathVariable Long id) {
        return asignaturaService.obtenerPorId(id);
    }

    @PostMapping
    public Asignatura guardar(@RequestBody Asignatura asignatura) {
        return asignaturaService.guardar(asignatura);
    }

    @PutMapping("/{id}")
    public Asignatura actualizar(@PathVariable Long id, @RequestBody Asignatura asignatura) {
        asignatura.setId(id);
        return asignaturaService.guardar(asignatura);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        asignaturaService.eliminar(id);
    }
}
