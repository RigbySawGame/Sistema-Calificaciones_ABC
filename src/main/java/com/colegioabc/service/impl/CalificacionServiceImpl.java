package com.colegioabc.service.impl;

import com.colegioabc.model.Calificacion;
import com.colegioabc.repository.CalificacionRepository;
import com.colegioabc.service.CalificacionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class CalificacionServiceImpl implements CalificacionService {

	@Autowired
	
    private CalificacionRepository calificacionRepository;

	@Override
	public List<Calificacion> listarTodos() {
		return calificacionRepository.findAll();
	}
	
	@Override
	public Calificacion obtenerPorId(Long id) {
		return calificacionRepository.findById(id).orElse(null);
	}
	
	@Override
	public Calificacion guardar(Calificacion calificacion) {
		return calificacionRepository.save(calificacion);
	}
	
	@Override
	public void eliminar(Long id) {
        calificacionRepository.deleteById(id);

	}
}
