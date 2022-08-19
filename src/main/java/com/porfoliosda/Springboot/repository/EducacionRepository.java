
package com.porfoliosda.Springboot.repository;

import com.porfoliosda.Springboot.model.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EducacionRepository extends JpaRepository <Educacion, Long>{
    
}
