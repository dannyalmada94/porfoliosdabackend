
package com.porfoliosda.Springboot.controller;

import com.porfoliosda.Springboot.model.Contacto;
import com.porfoliosda.Springboot.model.Persona;
import com.porfoliosda.Springboot.model.Proyectos;
import com.porfoliosda.Springboot.model.Educacion;
import com.porfoliosda.Springboot.model.Experiencia_laboral;
import com.porfoliosda.Springboot.model.Habilidades_blandas;
import com.porfoliosda.Springboot.model.Tecnologias;
import com.porfoliosda.Springboot.service.IContactoService;
import com.porfoliosda.Springboot.service.IPersonaService;
import com.porfoliosda.Springboot.service.IProyectosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.porfoliosda.Springboot.service.IEducacionService;
import com.porfoliosda.Springboot.service.IExperienciaLaboralService;
import com.porfoliosda.Springboot.service.IHabilidadesBlandasService;
import com.porfoliosda.Springboot.service.ITecnologiasService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class Controller {
    
    //Controlador para la tabla persona//
    @Autowired
    private IPersonaService persoServ;
    
    @PostMapping ("/personas")
    public void agregarPersona (@RequestBody Persona per) {
        persoServ.crearPersona(per);
    }
    
    @GetMapping ("/personas")
    @ResponseBody
    public List<Persona> verPersonas () {
        return persoServ.verPersonas();
    }
    
    @DeleteMapping ("/personas/borrar/{id}")
    public void borrarPersona (@PathVariable Long id) {
        persoServ.borrarPersona(id);
    
    }
    
    @GetMapping ("/personas/{id}")
    @ResponseBody
    public Persona buscarPersona (@PathVariable Long id) {
        return persoServ.buscarPersona(id);
    }
    
    @PutMapping ("/personas/editar/{id}")
    public Persona editarPersona (@PathVariable Long id, @RequestBody Persona pered) {
        
    Persona per = persoServ.buscarPersona(id);
    
    per.setNombre(pered.getNombre());
    per.setApellido(pered.getApellido());
    per.setEdad(pered.getEdad());
    per.setLocalidad(pered.getLocalidad());
    per.setPais(pered.getPais());
    per.setProfesion_oficio(pered.getProfesion_oficio());
    per.setAcerca_de_mi(pered.getAcerca_de_mi());
    
    persoServ.crearPersona(per);
    
    return per;
    }
    
    //Controlador par la tabla experiencia_laboral//
    @Autowired
    private IExperienciaLaboralService expServ;
    
    @PostMapping ("/experiencias")
    public void agregarExperiencia (@RequestBody Experiencia_laboral expl) {
        expServ.crearExperiencia(expl);   
    }
    
    @GetMapping ("/experiencias")
    @ResponseBody
    public List<Experiencia_laboral> verExperiencia () {
        return expServ.verExperiencia();
    }
    
    @GetMapping ("/experiencias/{id}")
    @ResponseBody
    public Experiencia_laboral buscarExperiencia (@PathVariable Long id) {
        return expServ.buscarExperiencia(id);
    }
    
    @DeleteMapping ("/experiencias/borrar/{id}")
    public void borrarExperiencia (@PathVariable Long id) {
        expServ.borrarExperiencia(id);
    
    }
    
     @PutMapping ("/experiencias/editar/{id}")
    public Experiencia_laboral editarExperiencia (@PathVariable Long id, @RequestBody Experiencia_laboral exp) {
        
    Experiencia_laboral expl = expServ.buscarExperiencia(id);
    
    expl.setModalidad(exp.getModalidad());
    expl.setNombre_empresa(exp.getNombre_empresa());
    expl.setDescripcion(exp.getDescripcion());
    
    expServ.crearExperiencia(expl);
    
    return expl;
    }
    
    //Controlador para la tabla educacion//
    @Autowired
    private IEducacionService eduServ;
    
    @PostMapping ("/educacion")
    public void agregarEducacion(@RequestBody Educacion edu) {
        eduServ.crearEducacion(edu);
    }
    
    @GetMapping ("/educacion")
    @ResponseBody
    public List<Educacion> verEducacion() {
        return eduServ.verEducacion();
    }
    
    @DeleteMapping ("educacion/borrar/{id}")
    public void borrarEducacion (@PathVariable Long id) {
        eduServ.borrarEducacion(id);
    }
    
    @GetMapping ("/educacion/{id}")
    @ResponseBody
    public Educacion buscarEducacion (@PathVariable Long id) {
        return eduServ.buscarEducacion(id);
    }
    
    @PutMapping ("/educacion/editar/{id}")
    public Educacion editarEducacion (@PathVariable Long id, @RequestBody Educacion edued) {
        
    Educacion edu = eduServ.buscarEducacion(id);
    
    edu.setTipo_educacion(edued.getTipo_educacion());
    edu.setTitulo(edued.getTitulo());
    edu.setDescripcion(edued.getDescripcion());
    
    eduServ.crearEducacion(edu);
    
    return edu;
    }
    
    //Controlador para la tabla habilidades_blandas//
    @Autowired
    private IHabilidadesBlandasService habilServ;
    
    @PostMapping ("/habilidades")
    public void agregarHabilidad(@RequestBody Habilidades_blandas habil) {
        habilServ.crearHabilidad(habil);
    }
    
    @GetMapping ("/habilidades")
    @ResponseBody
    public List<Habilidades_blandas> verHabilidad() {
        return habilServ.verHabilidad();
    }
    
    @DeleteMapping ("/habilidades/borrar/{id}")
    public void borrarHabilidad (@PathVariable Long id) {
        habilServ.borrarHabilidad(id);
    }
    
    @GetMapping ("/habilidades/{id}")
    @ResponseBody
    public Habilidades_blandas buscarHabilidad (@PathVariable Long id) {
        return habilServ.buscarHabilidad(id);
    }
    
    @PutMapping ("/habilidades/editar/{id}")
    public Habilidades_blandas editarHabilidad (@PathVariable Long id, @RequestBody Habilidades_blandas habiled) {
        
    Habilidades_blandas habil = habilServ.buscarHabilidad(id);
    
    habil.setTipo_habilidad(habiled.getTipo_habilidad());
    habil.setDescripcion(habiled.getDescripcion());
    
    habilServ.crearHabilidad(habil);
    
    return habil;
    }
    
    //Controlador para la tabla "tecnologias"//
    @Autowired
    private ITecnologiasService tecServ;
    
    @PostMapping ("/tecnologias")
    public void agregarTecnologia(@RequestBody Tecnologias tec) {
        tecServ.crearTecnologia(tec);
    }
    
    @GetMapping ("/tecnologias")
    @ResponseBody
    public List<Tecnologias> verTecnologia() {
        return tecServ.verTecnologia();
    }
    
    @DeleteMapping ("/tecnologias/borrar/{id}")
    public void borrarTecnologia (@PathVariable Long id) {
        tecServ.borrarTecnologia(id);
    }
    
    @GetMapping ("/tecnologias/{id}")
    @ResponseBody
    public Tecnologias buscarTecnologia (@PathVariable Long id) {
        return tecServ.buscarTecnologia(id);
    }
    
    @PutMapping ("/tecnologias/editar/{id}")
    public Tecnologias editarTecnologia (@PathVariable Long id, @RequestBody Tecnologias teced) {
        
    Tecnologias tec = tecServ.buscarTecnologia(id);
    
    tec.setLenguaje_framework(teced.getLenguaje_framework());
    tec.setDescripcion(teced.getDescripcion());
    
    tecServ.crearTecnologia(tec);
    
    return tec;
    }
    
    //Controlador para la tabla "Contacto//
    @Autowired
    private IContactoService contacServ;
    
    @PostMapping ("/contacto")
    public void agregarContacto(@RequestBody Contacto cont) {
        contacServ.crearContacto(cont);
    }
    
    @GetMapping ("/contacto")
    @ResponseBody
    public List<Contacto> verContacto() {
        return contacServ.verContacto();
    }
    
    @DeleteMapping ("contacto/borrar/{id}")
    public void borrarContacto (@PathVariable Long id) {
        contacServ.borrarContacto(id);
    }
    
    @GetMapping ("/contacto/{id}")
    @ResponseBody
    public Contacto buscarContacto (@PathVariable Long id) {
        return contacServ.buscarContacto(id);
    }
    
    @PutMapping ("/contacto/editar/{id}")
    public Contacto editarContacto (@PathVariable Long id, @RequestBody Contacto conted) {
        
    Contacto cont = contacServ.buscarContacto(id);
    
    cont.setCelular(conted.getCelular());
    cont.setEmail(conted.getEmail());
    cont.setLinkedin_url(conted.getLinkedin_url());
    cont.setInstagram_url(conted.getInstagram_url());
    cont.setFacebook_url(conted.getFacebook_url());
    cont.setYoutube_url(conted.getYoutube_url());
    
    contacServ.crearContacto(cont);
    
    return cont;
    }
   
    //Controlador para la tabla proyectos//
    @Autowired
    private IProyectosService proyServ;
    
    @PostMapping ("/proyectos")
    public void agregarProyecto(@RequestBody Proyectos proy) {
        proyServ.crearProyecto(proy);
    }
    
    @GetMapping ("/proyectos")
    @ResponseBody
    public List<Proyectos> verProyectos() {
        return proyServ.verProyectos();
    }
        
    @DeleteMapping ("/proyectos/borrar/{id}")
    public void borrarProyecto (@PathVariable Long id) {
        proyServ.borrarProyecto(id);
    }
    
    @GetMapping ("/proyectos/{id}")
    @ResponseBody
    public Proyectos buscarProyecto (@PathVariable Long id) {
        return proyServ.buscarProyecto(id);
    }
    
    @PutMapping ("/proyectos/editar/{id}")
    public Proyectos editarProyectos (@PathVariable Long id, @RequestBody Proyectos proyed) {
        
    Proyectos proy = proyServ.buscarProyecto(id);
    
    proy.setNombre_proyecto(proyed.getNombre_proyecto());
    proy.setDescripcion(proyed.getDescripcion());
    
    proyServ.crearProyecto(proy);
    
    return proy;
    }
}
