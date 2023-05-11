/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.backend.Dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author bonni
 */
public class dtoRedes {
    
    
    @NotBlank
    private String urlRed;  
  
    @Size(min = 1, max = 500, message = "No cumple con la longitud")
    private String urlRedImg;

    public dtoRedes(){
    }

    public dtoRedes(String urlRed, String urlRedImg) {
        this.urlRed = urlRed;
        this.urlRedImg = urlRedImg;
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
