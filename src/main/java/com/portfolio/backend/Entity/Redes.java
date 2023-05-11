/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.backend.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author bonni
 */
@Entity
public class Redes {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //campo primary key autogenerado
    private int idRed;
    
    @NotNull
    @Size(min = 1, max = 500, message = "No cumple con la longitud")
    private String urlRed;  


  
    @Size(min = 1, max = 500, message = "No cumple con la longitud")
    private String urlRedImg;

    public Redes() {
    }

    public Redes(String urlRed, String urlRedImg) {
        this.urlRed = urlRed;
        this.urlRedImg = urlRedImg;
    }
    

    public int getIdRed() {
        return idRed;
        
    }

    public void setIdRed(int idRed) {
        this.idRed = idRed;
    }

    public String getUrlRed() {
        return urlRed;
    }

    public void setUrlRed(String urlRed) {
        this.urlRed = urlRed;
    }

    public String getUrlRedImg() {
        return urlRedImg;
    }

    public void setUrlRedImg(String urlRedImg) {
        this.urlRedImg = urlRedImg;
    }
    
    
    
}
