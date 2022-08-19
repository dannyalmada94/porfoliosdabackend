
package com.porfoliosda.Springboot.service;

import com.porfoliosda.Springboot.model.Proyectos;
import java.util.List;


public interface IProyectosService {
    public List<Proyectos> verProyectos();
    public void crearProyecto(Proyectos proy);
    public void borrarProyecto(Long id);
    public Proyectos buscarProyecto(Long id);
}
