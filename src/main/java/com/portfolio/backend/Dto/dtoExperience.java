package com.portfolio.backend.Dto;

import javax.validation.constraints.NotBlank;

public class dtoExperience {

    @NotBlank
    private String puesto;
    @NotBlank
    private String empresa;
    @NotBlank
    private String tiempo;
    @NotBlank
    private String contacto;

    public dtoExperience() {
    }

    public dtoExperience(String puesto, String empresa, String tiempo, String contacto) {
        this.puesto = puesto;
        this.empresa = empresa;
        this.tiempo = tiempo;
        this.contacto = contacto;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

   
}
