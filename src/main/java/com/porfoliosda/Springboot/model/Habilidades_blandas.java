
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
@Table(name = "habilidades_blandas")
public class Habilidades_blandas {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_habilidades;
    private String tipo_habilidad;
    private String descripcion;

    public Habilidades_blandas() {
    }

    public Habilidades_blandas(Long id_habilidades, String tipo_habilidad, String descripcion) {
        this.id_habilidades = id_habilidades;
        this.tipo_habilidad = tipo_habilidad;
        this.descripcion = descripcion;
    }
    
    
    
    
}
