
package com.porfoliosda.Springboot.repository;

import com.porfoliosda.Springboot.model.Contacto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactoRepository extends JpaRepository <Contacto, Long>{
    
}
