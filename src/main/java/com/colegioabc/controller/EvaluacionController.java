package com.colegioabc.controller;

import com.colegioabc.model.Evaluacion;
import com.colegioabc.service.EvaluacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/evaluaciones")
@CrossOrigin(origins = "*")
public class EvaluacionController {

    @Autowired
    private EvaluacionService evaluacionService;

    @GetMapping
    public List<Evaluacion> listarTodos() {
        return evaluacionService.listarTodos();
    }

    @GetMapping("/{id}")
    public Evaluacion obtenerPorId(@PathVariable Long id) {
        return evaluacionService.obtenerPorId(id);
    }

    @PostMapping
    public Evaluacion guardar(@RequestBody Evaluacion evaluacion) {
        return evaluacionService.guardar(evaluacion);
    }

    @PutMapping("/{id}")
    public Evaluacion actualizar(@PathVariable Long id, @RequestBody Evaluacion evaluacion) {
        evaluacion.setId(id);
        return evaluacionService.guardar(evaluacion);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        evaluacionService.eliminar(id);
    }
}
