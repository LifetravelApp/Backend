package com.api.lifetravelrest.lifetravel.domain.model;

import javax.persistence.*;

@Entity
@Table
public class Persona {
    @Id
    @SequenceGenerator(
            name = "persona_sequence",
            sequenceName = "persona_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "persona_sequence"
    )
     private int idPersona;

    @Column (name = "nombre", length = 50)
     private String nombre;
    
     public int getIdPersona() {
         return idPersona;
     }
     public void setIdPersona(int idPersona) {
    	 this.idPersona = idPersona; 
     }	
         
     public String getNombre() {
         return nombre;
     }
     public void setNombre( String nombre) {
         this. nombre = nombre;
     }
}