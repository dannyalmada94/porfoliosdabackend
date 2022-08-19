
package com.porfoliosda.Springboot.service;

import com.porfoliosda.Springboot.model.Contacto;
import com.porfoliosda.Springboot.repository.ContactoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactoService implements IContactoService {
    
    @Autowired
    public ContactoRepository contacRepo;

    @Override
    public List<Contacto> verContacto() {
        return contacRepo.findAll();
    }

    @Override
    public void crearContacto(Contacto cont) {
        contacRepo.save(cont);
    }

    @Override
    public void borrarContacto(Long id) {
        contacRepo.deleteById(id);
    }

    @Override
    public Contacto buscarContacto(Long id) {
        return contacRepo.findById(id).orElse(null);
    }
    
  
}
