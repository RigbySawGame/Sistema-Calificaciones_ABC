package com.colegioabc.controller;

import com.colegioabc.model.Calificacion;
import com.colegioabc.service.CalificacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/calificaciones")
@CrossOrigin(origins = "*")
public class CalificacionController {

    @Autowired
    private CalificacionService calificacionService;

    @GetMapping
    public List<Calificacion> listarTodos() {
        return calificacionService.listarTodos();
    }

    @GetMapping("/{id}")
    public Calificacion obtenerPorId(@PathVariable Long id) {
        return calificacionService.obtenerPorId(id);
    }

    @PostMapping
    public Calificacion guardar(@RequestBody Calificacion calificacion) {
        return calificacionService.guardar(calificacion);
    }

    @PutMapping("/{id}")
    public Calificacion actualizar(@PathVariable Long id, @RequestBody Calificacion calificacion) {
        calificacion.setId(id);
        return calificacionService.guardar(calificacion);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        calificacionService.eliminar(id);
    }
}
