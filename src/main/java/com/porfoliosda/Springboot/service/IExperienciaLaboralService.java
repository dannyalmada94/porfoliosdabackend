
package com.porfoliosda.Springboot.service;

import com.porfoliosda.Springboot.model.Experiencia_laboral;
import java.util.List;


public interface IExperienciaLaboralService {
    public List<Experiencia_laboral> verExperiencia();
    public void crearExperiencia(Experiencia_laboral expl);
    public void borrarExperiencia(Long id);
    public Experiencia_laboral buscarExperiencia(Long id);
}
