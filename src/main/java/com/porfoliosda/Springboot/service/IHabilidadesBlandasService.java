
package com.porfoliosda.Springboot.service;

import com.porfoliosda.Springboot.model.Habilidades_blandas;
import java.util.List;


public interface IHabilidadesBlandasService {
    public List<Habilidades_blandas> verHabilidad();
    public void crearHabilidad(Habilidades_blandas hab);
    public void borrarHabilidad(Long id);
    public Habilidades_blandas buscarHabilidad(Long id);
}
