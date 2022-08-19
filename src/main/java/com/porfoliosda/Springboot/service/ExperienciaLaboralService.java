
package com.porfoliosda.Springboot.service;

import com.porfoliosda.Springboot.model.Experiencia_laboral;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.porfoliosda.Springboot.repository.ExperienciaLaboralRepository;

@Service
public class ExperienciaLaboralService implements IExperienciaLaboralService {
    
    @Autowired
    public ExperienciaLaboralRepository expRepo;

    @Override
    public List<Experiencia_laboral> verExperiencia() {
        return expRepo.findAll();
    }

    @Override
    public void crearExperiencia(Experiencia_laboral expl) {
        expRepo.save(expl);
    }

    @Override
    public void borrarExperiencia(Long id) {
        expRepo.deleteById(id);
    }

    @Override
    public Experiencia_laboral buscarExperiencia(Long id) {
        return expRepo.findById(id).orElse(null);

    }
    
    
}
