package com.api.lifetravelrest.lifetravel.service;

import com.api.lifetravelrest.lifetravel.domain.service.IPersonaService;
import com.api.lifetravelrest.lifetravel.domain.persistence.IPersonaRepo;
import com.api.lifetravelrest.lifetravel.domain.model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaServiceImpl implements IPersonaService {

	@Autowired
	private IPersonaRepo repo;

	@Override
	public Persona registrar(String nombre) {
		Persona persona = new Persona();
		persona.setNombre(nombre);
		return repo.save(persona);
	}

	@Override
	public List<Persona> listar() {
		return repo.findAll();
	}

	@Override
	public List<Persona> listarPorNombre(String nombre) {
		 // assign to a variable repo.findByNombre(nombre)
		List<Persona> persona = repo.findByNombre(nombre);
		// return the variable
		return persona;
	}

}
