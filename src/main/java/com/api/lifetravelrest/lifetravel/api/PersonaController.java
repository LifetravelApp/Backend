package com.api.lifetravelrest.lifetravel.api;

import java.util.List;
import java.util.Optional;

import com.api.lifetravelrest.lifetravel.domain.model.Persona;
import com.api.lifetravelrest.lifetravel.domain.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/personas")
public class PersonaController {

    private final IPersonaService personaService;

    @Autowired
    public PersonaController(IPersonaService personaService) {
        this.personaService = personaService;
    }

    @GetMapping
    public List<Persona> getPersonas() {
        return personaService.listar();
    }

    @PostMapping
    public Persona registrar(@RequestBody Persona persona) {
    	return personaService.registrar(persona.getNombre());
    }

    @GetMapping("/search")
    public String getPersonaPorNombre(@RequestParam String nombre) {
        List<Persona> personas = personaService.listarPorNombre(nombre);
        personas.forEach(persona -> System.out.print(persona.getNombre() + " "));
        return "Hello World";
    }
}
      
