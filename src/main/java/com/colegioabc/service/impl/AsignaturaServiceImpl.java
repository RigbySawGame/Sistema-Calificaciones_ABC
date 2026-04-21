package com.colegioabc.service.impl;

import com.colegioabc.model.Asignatura;
import com.colegioabc.repository.AsignaturaRepository;
import com.colegioabc.service.AsignaturaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class AsignaturaServiceImpl implements AsignaturaService{

	 @Autowired
	private AsignaturaRepository asignaturaRepository;
	
	@Override
	public List<Asignatura> listarTodos() {
		return asignaturaRepository.findAll();
	}

	@Override
	public Asignatura obtenerPorId(Long id) {
		return asignaturaRepository.findById(id).orElse(null);
	}

	@Override
	public Asignatura guardar(Asignatura asignatura) {
		return asignaturaRepository.save(asignatura);
	}

	@Override
	public void eliminar(Long id) {
		asignaturaRepository.deleteById(id);	
	}	
}
