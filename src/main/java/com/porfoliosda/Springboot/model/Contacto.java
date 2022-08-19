
package com.porfoliosda.Springboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "Contacto")
public class Contacto {
    
    @Id
    @GeneratedValue ( strategy= GenerationType.AUTO )
    private Long id_contacto;
    private String celular;
    private String email;
    private String linkedin_url;
    private String instagram_url;
    private String facebook_url;
    private String youtube_url;
    

    public Contacto() {
    }

    public Contacto(Long id_contacto, String celular, String email, String linkedin_url, String instagram_url, String facebook_url, String youtube_url) {
        this.id_contacto = id_contacto;
        this.celular = celular;
        this.email = email;
        this.linkedin_url = linkedin_url;
        this.instagram_url = instagram_url;
        this.facebook_url = facebook_url;
        this.youtube_url = youtube_url;
    }
    
    
    
    
}

