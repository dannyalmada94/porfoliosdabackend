
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
@Table(name = "tecnologias")
public class Tecnologias {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_tecnologias;
    private String lenguaje_framework;
    private String descripcion;

    public Tecnologias() {
    }

    public Tecnologias(Long id_tecnologias, String lenguaje_framework, String descripcion) {
        this.id_tecnologias = id_tecnologias;
        this.lenguaje_framework = lenguaje_framework;
        this.descripcion = descripcion;
    }
    
    
    
    
    
    
}
