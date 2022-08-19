
package com.porfoliosda.Springboot.repository;

import com.porfoliosda.Springboot.model.Habilidades_blandas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabilidadesBlandasRepository extends JpaRepository<Habilidades_blandas, Long> {
    
}
