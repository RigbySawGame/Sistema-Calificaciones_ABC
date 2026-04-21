package com.colegioabc.service.impl;

import com.colegioabc.model.Profesor;
import com.colegioabc.repository.ProfesorRepository;
import com.colegioabc.service.ProfesorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProfesorServiceImpl implements ProfesorService{

	@Autowired
	private ProfesorRepository profesorRepository;

    @Override
    public List<Profesor> listarTodos() {
        return profesorRepository.findAll();
    }

    @Override
    public Profesor obtenerPorId(Long id) {
        return profesorRepository.findById(id).orElse(null);
    }

    @Override
    public Profesor guardar(Profesor profesor) {
        return profesorRepository.save(profesor);
    }

    @Override
    public void eliminar(Long id) {
    	profesorRepository.deleteById(id);
    }
}
