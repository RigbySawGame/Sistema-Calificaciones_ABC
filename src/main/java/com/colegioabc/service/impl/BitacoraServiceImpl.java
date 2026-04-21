package com.colegioabc.service.impl;

import com.colegioabc.model.Bitacora;
import com.colegioabc.repository.BitacoraRepository;
import com.colegioabc.service.BitacoraService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class BitacoraServiceImpl implements BitacoraService {

	   @Autowired
	    private BitacoraRepository bitacoraRepository;

	    @Override
	    public List<Bitacora> listarTodos() {
	        return bitacoraRepository.findAll();
	    }

	    @Override
	    public Bitacora obtenerPorId(Long id) {
	        return bitacoraRepository.findById(id).orElse(null);
	    }

	    @Override
	    public Bitacora guardar(Bitacora bitacora) {
	        return bitacoraRepository.save(bitacora);
	    }

	    @Override
	    public void eliminar(Long id) {
	    	bitacoraRepository.deleteById(id);
	    }
	}

