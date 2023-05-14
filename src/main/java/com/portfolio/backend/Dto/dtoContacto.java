/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.backend.Dto;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;




/**
 *
 * @author bonni
 */


public class dtoContacto {
    
    @NotBlank
    private String desCont;
 
    @NotBlank
    private String email;
    
    @NotBlank
    private String phone;
    
  
    public dtoContacto() {
    }

    public dtoContacto(String desCont, String email, String phone) {
        this.desCont = desCont;
        this.email = email;
        this.phone = phone;
     
    }    

    public String getDesCont() {
        return desCont;
    }

    public void setDesCont(String desCont) {
        this.desCont = desCont;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    
    
}
