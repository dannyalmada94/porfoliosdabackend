
package com.porfoliosda.Springboot.repository;

import com.porfoliosda.Springboot.model.Experiencia_laboral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaLaboralRepository extends JpaRepository <Experiencia_laboral, Long>{
    
}
