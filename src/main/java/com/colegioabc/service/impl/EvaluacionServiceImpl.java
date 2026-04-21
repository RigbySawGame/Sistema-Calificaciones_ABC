package com.colegioabc.service.impl;

import com.colegioabc.model.Evaluacion;
import com.colegioabc.repository.EvaluacionRepository;
import com.colegioabc.service.EvaluacionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class EvaluacionServiceImpl implements EvaluacionService {

	@Autowired
    private EvaluacionRepository evaluacionRepository;

	@Override
	public List<Evaluacion> listarTodos() {
		return evaluacionRepository.findAll();
	}

	@Override
	public Evaluacion obtenerPorId(Long id) {
		 return evaluacionRepository.findById(id).orElse(null);
	}

	@Override
	public Evaluacion guardar(Evaluacion evaluacion) {
        return evaluacionRepository.save(evaluacion);
	}

	@Override
	public void eliminar(Long id) {
		evaluacionRepository.deleteById(id);		
	}
}
