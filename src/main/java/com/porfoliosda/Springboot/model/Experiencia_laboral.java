
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
@Table(name = "experiencia_laboral")
public class Experiencia_laboral {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_experiencia;
    private String modalidad;
    private String nombre_empresa;
    private String descripcion;

    public Experiencia_laboral() {
    }

    public Experiencia_laboral(Long id_experiencia, String modalidad, String nombre_empresa, String descripcion) {
        this.id_experiencia = id_experiencia;
        this.modalidad = modalidad;
        this.nombre_empresa = nombre_empresa;
        this.descripcion = descripcion;
    }
    
}
