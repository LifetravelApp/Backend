package com.api.lifetravelrest.lifetravel.domain.persistence;

import com.api.lifetravelrest.lifetravel.domain.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.validation.constraints.Max;
import java.util.List;
import java.util.Optional;

@Repository
public interface IPersonaRepo extends JpaRepository<Persona, Integer> {

    // SELECT * FROM persona WHERE nombre = ?
    @Query("SELECT p FROM Persona p WHERE p.nombre = ?1")
    List<Persona> findByNombre (String nombre);

}
