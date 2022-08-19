
package com.porfoliosda.Springboot.service;

import com.porfoliosda.Springboot.model.Contacto;
import java.util.List;


public interface IContactoService {
    public List<Contacto> verContacto();
    public void crearContacto(Contacto cont);
    public void borrarContacto(Long id);
    public Contacto buscarContacto(Long id);
}
