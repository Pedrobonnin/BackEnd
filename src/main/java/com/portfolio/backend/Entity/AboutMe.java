
package com.portfolio.backend.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class AboutMe {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //campo primary key autogenerado
    private int idAbout;
    
    @NotNull
    @Size (max = 2500)
    private String aboutText;
    
   
    private String imgPerfil;

   

    public AboutMe() {
    }

    public AboutMe(String aboutText, String imgPerfil) {
        this.aboutText = aboutText;
        this.imgPerfil = imgPerfil;
    }

    public int getIdAbout() {
        return idAbout;
    }

    public void setIdAbout(int idAbout) {
        this.idAbout = idAbout;
    }

    public String getAboutText() {
        return aboutText;
    }

    public void setAboutText(String aboutText) {
        this.aboutText = aboutText;
    }
    
     public String getImgPerfil() {
        return imgPerfil;
    }

    public void setImgPerfil(String imgPerfil) {
        this.imgPerfil = imgPerfil;
    }
    
    
}
