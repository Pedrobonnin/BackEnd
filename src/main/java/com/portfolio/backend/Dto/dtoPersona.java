package com.portfolio.backend.Dto;

import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
public class dtoPersona {

    @NotBlank
    private String nombre;

    @NotBlank
    private String apellido;
    
     @NotBlank
    private String descripcion;
     
      @NotBlank
    private String profesion;

    
    private String imglogo;


    @NotBlank
    private String cv;

  

    public dtoPersona() {
    }

    public dtoPersona(String nombre, String apellido, String descripcion, String profesion, String imglogo, String cv) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.descripcion = descripcion;
        this.profesion = profesion;
        this.imglogo = imglogo;
        this.cv = cv;
      
    }

    
}
