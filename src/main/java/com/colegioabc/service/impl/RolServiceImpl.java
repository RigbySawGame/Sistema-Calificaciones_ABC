package com.colegioabc.service.impl;

import com.colegioabc.model.Rol;
import com.colegioabc.repository.RolRepository;
import com.colegioabc.service.RolService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class RolServiceImpl implements RolService{

	@Autowired
	private RolRepository rolRepository;

	@Override
	public List<Rol> listarTodos() {
		return rolRepository.findAll();
	}

	@Override
	public Rol obtenerPorId(Long id) {
		return rolRepository.findById(id).orElse(null);
	}

	@Override
	public Rol guardar(Rol rol) {
		return rolRepository.save(rol);
	}

	@Override
	public void eliminar(Long id) {
		rolRepository.deleteById(id);		
	}
	
}
