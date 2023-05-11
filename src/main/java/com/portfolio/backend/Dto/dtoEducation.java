package com.portfolio.backend.Dto;

import javax.validation.constraints.NotBlank;

public class dtoEducation {

    @NotBlank
    private String titulo;
    @NotBlank
    private String escuela;
    @NotBlank
    private String tiempo;
    @NotBlank
    private String nivel;
    @NotBlank
    private String localidad;

    public dtoEducation() {
    }

    public dtoEducation(String titulo, String escuela, String tiempo, String nivel, String localidad) {
        this.titulo = titulo;
        this.escuela = escuela;
        this.tiempo = tiempo;
        this.nivel = nivel;
        this.localidad = localidad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

}
