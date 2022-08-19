
package com.porfoliosda.Springboot.repository;

import com.porfoliosda.Springboot.model.Proyectos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectosRepository extends JpaRepository <Proyectos, Long>{
    
}
