package com.portfolio.backend.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



@Entity
public class Skills {

    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //campo primary key autogenerado
    private int idSkill;

    @NotNull
    @Size(min = 1, max = 50)
    private String unaSkill;
    
    @NotNull
    private int porcentaje;

    private String outerStrokeColor;
    
    public Skills() {

    }

    public Skills(String unaSkill,int porcentaje, String outerStrokeColor) {
        this.unaSkill = unaSkill;
        this.porcentaje = porcentaje;
        this.outerStrokeColor = outerStrokeColor;
    }  
    
    
    

    public int getIdSkill() {
        return idSkill;
    }

    public void setIdSkill(int idSkill) {
        this.idSkill = idSkill;
    }

    public String getUnaSkill() {
        return unaSkill;
    }

    public void setUnaSkill(String unaSkill) {
        this.unaSkill = unaSkill;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    public String getOuterStrokeColor() {
        return outerStrokeColor;
    }

    public void setOuterStrokeColor(String outerStrokeColor) {
        this.outerStrokeColor = outerStrokeColor;
    }
    
    
    
}
