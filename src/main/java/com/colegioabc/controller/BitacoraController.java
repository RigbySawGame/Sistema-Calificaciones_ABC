package com.colegioabc.controller;

import com.colegioabc.model.Bitacora;
import com.colegioabc.service.BitacoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bitacora")
@CrossOrigin(origins = "*")
public class BitacoraController {

    @Autowired
    private BitacoraService bitacoraService;

    @GetMapping
    public List<Bitacora> listarTodos() {
        return bitacoraService.listarTodos();
    }

    @GetMapping("/{id}")
    public Bitacora obtenerPorId(@PathVariable Long id) {
        return bitacoraService.obtenerPorId(id);
    }

    @PostMapping
    public Bitacora guardar(@RequestBody Bitacora bitacora) {
        return bitacoraService.guardar(bitacora);
    }

    @PutMapping("/{id}")
    public Bitacora actualizar(@PathVariable Long id, @RequestBody Bitacora bitacora) {
        bitacora.setId(id);
        return bitacoraService.guardar(bitacora);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        bitacoraService.eliminar(id);
    }
}
