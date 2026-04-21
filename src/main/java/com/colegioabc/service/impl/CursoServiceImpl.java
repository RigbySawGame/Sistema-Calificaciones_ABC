package com.colegioabc.service.impl;

import com.colegioabc.model.Curso;
import com.colegioabc.repository.CursoRepository;
import com.colegioabc.service.CursoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class CursoServiceImpl implements CursoService {

	@Autowired
	private CursoRepository cursoRepository;

	@Override
	public List<Curso> listarTodos() {
		return cursoRepository.findAll();
	}

	@Override
	public Curso obtenerPorId(Long id) {
		return cursoRepository.findById(id).orElse(null);
	}

	@Override
	public Curso guardar(Curso curso) {
		return cursoRepository.save(curso);
	}

	@Override
	public void eliminar(Long id) {
		cursoRepository.deleteById(id);
	}
}
