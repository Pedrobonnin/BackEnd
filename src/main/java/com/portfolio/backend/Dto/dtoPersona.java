package com.portfolio.backend.Dto;

import javax.validation.constraints.NotBlank;




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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getImglogo() {
        return imglogo;
    }

    public void setImglogo(String imglogo) {
        this.imglogo = imglogo;
    }

    public String getCv() {
        return cv;
    }

    public void setCv(String cv) {
        this.cv = cv;
    }

    
}
