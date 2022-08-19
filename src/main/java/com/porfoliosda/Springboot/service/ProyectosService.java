
package com.porfoliosda.Springboot.service;

import com.porfoliosda.Springboot.model.Proyectos;
import com.porfoliosda.Springboot.repository.ProyectosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectosService implements IProyectosService {
    
    @Autowired
    public ProyectosRepository proyRepo;

    @Override
    public List<Proyectos> verProyectos() {
        return proyRepo.findAll();
    }

    @Override
    public void crearProyecto(Proyectos proy) {
        proyRepo.save(proy);
    }

    @Override
    public void borrarProyecto(Long id) {
        proyRepo.deleteById(id);
    }

    @Override
    public Proyectos buscarProyecto(Long id) {
        return proyRepo.findById(id).orElse(null);
    }
    
}
