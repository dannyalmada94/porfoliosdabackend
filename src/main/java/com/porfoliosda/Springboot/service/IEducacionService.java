
package com.porfoliosda.Springboot.service;

import com.porfoliosda.Springboot.model.Educacion;
import java.util.List;


public interface IEducacionService {
    public List<Educacion> verEducacion();
    public void crearEducacion(Educacion edu);
    public void borrarEducacion(Long id);
    public Educacion buscarEducacion(Long id);
}
