
package com.portfolio.backend.Dto;

import javax.validation.constraints.NotBlank;


public class dtoSkills {
    @NotBlank
    private String unaSkill;
    @NotBlank
    private int porcentaje;
  
    private String outerStrokeColor;
    
    public dtoSkills() {
        }
 
    public dtoSkills(String unaSkill, int porcentaje, String outerStrokeColor) {
        this.unaSkill = unaSkill;
        this.porcentaje = porcentaje;
        this.outerStrokeColor = outerStrokeColor;
    }
    
    public void setUnaSkill(String unaSkill) {
        this.unaSkill = unaSkill;
  
    }
    
    public String getUnaSkill() {
            return unaSkill;
    }
    
     public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }
 
     
    public int getPorcentaje() {
        return porcentaje;
    }

    public String getOuterStrokeColor() {
        return outerStrokeColor;
    }

    public void setOuterStrokeColor(String outerStrokeColor) {
        this.outerStrokeColor = outerStrokeColor;
    }

   

    
   

   
    
}
