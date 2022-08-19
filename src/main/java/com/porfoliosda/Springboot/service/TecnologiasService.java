
package com.porfoliosda.Springboot.service;

import com.porfoliosda.Springboot.model.Tecnologias;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.porfoliosda.Springboot.repository.TecnologiasRepository;

@Service
public class TecnologiasService implements ITecnologiasService {
    
    @Autowired
    public TecnologiasRepository tecRepo;

    @Override
    public List<Tecnologias> verTecnologia() {
        return tecRepo.findAll();
    }

    @Override
    public void crearTecnologia(Tecnologias tec) {
        tecRepo.save(tec);
    }

    @Override
    public void borrarTecnologia(Long id) {
        tecRepo.deleteById(id);
    }

    @Override
    public Tecnologias buscarTecnologia(Long id) {
        return tecRepo.findById(id).orElse(null);
    }
    
}
