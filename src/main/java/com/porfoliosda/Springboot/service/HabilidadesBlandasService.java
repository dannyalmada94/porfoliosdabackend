
package com.porfoliosda.Springboot.service;

import com.porfoliosda.Springboot.model.Habilidades_blandas;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.porfoliosda.Springboot.repository.HabilidadesBlandasRepository;

@Service
public class HabilidadesBlandasService implements IHabilidadesBlandasService{
    
    @Autowired
    public HabilidadesBlandasRepository habilRepo;

    @Override
    public List<Habilidades_blandas> verHabilidad() {
        return habilRepo.findAll();
    }

    @Override
    public void crearHabilidad(Habilidades_blandas hab) {
        habilRepo.save(hab);
    }

    @Override
    public void borrarHabilidad(Long id) {
        habilRepo.deleteById(id);
    }

    @Override
    public Habilidades_blandas buscarHabilidad(Long id) {
        return habilRepo.findById(id).orElse(null);
    }
    
}
