
package com.portfolio.backend.Dto;

import javax.validation.constraints.NotBlank;


public class dtoAboutme {
    @NotBlank
    private String aboutText;
    
    private String imgPerfil;

    public dtoAboutme() {
    }

    public dtoAboutme(String aboutText,String imgPerfil) {
        this.aboutText = aboutText;
        this.imgPerfil = imgPerfil;
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
