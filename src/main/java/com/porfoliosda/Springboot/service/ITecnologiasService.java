
package com.porfoliosda.Springboot.service;

import com.porfoliosda.Springboot.model.Tecnologias;
import java.util.List;


public interface ITecnologiasService {
        public List<Tecnologias> verTecnologia();
    public void crearTecnologia(Tecnologias tec);
    public void borrarTecnologia(Long id);
    public Tecnologias buscarTecnologia(Long id);
}
