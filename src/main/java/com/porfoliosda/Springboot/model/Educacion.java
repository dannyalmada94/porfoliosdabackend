
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
@Table(name = "educacion")
public class Educacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_educacion;
    private String tipo_educacion;
    private String titulo;
    private String descripcion;

    public Educacion() {
    }

    public Educacion(Long id_educacion, String tipo_educacion, String titulo, String descripcion) {
        this.id_educacion = id_educacion;
        this.tipo_educacion = tipo_educacion;
        this.titulo = titulo;
        this.descripcion = descripcion;
    }
    
    
    
}
