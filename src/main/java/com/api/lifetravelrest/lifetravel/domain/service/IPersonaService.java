package com.api.lifetravelrest.lifetravel.domain.service;

import com.api.lifetravelrest.lifetravel.domain.model.Persona;

import java.util.List;
import java.util.Optional;

public interface IPersonaService {
    List<Persona> listar();

    Persona registrar(String nombre);

    List<Persona> listarPorNombre(String nombre);
}
