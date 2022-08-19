
package com.porfoliosda.Springboot.repository;

import com.porfoliosda.Springboot.model.Tecnologias;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TecnologiasRepository extends JpaRepository <Tecnologias, Long>{
    
}
