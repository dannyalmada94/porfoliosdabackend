
package com.porfoliosda.Springboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
@Table(name = "persona")
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_persona;
    private String nombre;
    private String apellido;
    private int edad;
    private String localidad;
    private String pais;
    private String profesion_oficio;
    private String acerca_de_mi;
    

    public Persona() {
    }

    public Persona(Long id_persona, String nombre, String apellido, int edad, String localidad, String pais, String profesion_oficio, String acerca_de_mi) {
        this.id_persona = id_persona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.localidad = localidad;
        this.pais = pais;
        this.profesion_oficio = profesion_oficio;
        this.acerca_de_mi = acerca_de_mi;
    }
    
    
    



    }



    
    

    


