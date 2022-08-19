
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
@Table (name = "proyectos")
public class Proyectos {
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id_proyecto;
    private String nombre_proyecto;
    private String descripcion;
    


    public Proyectos() {
    }

    public Proyectos(Long id_proyecto, String nombre_proyecto, String descripcion ) {
        this.id_proyecto = id_proyecto;
        this.nombre_proyecto = nombre_proyecto;
        this.descripcion = descripcion;
    }
    
    
}
