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
public class Contacto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //campo primary key autogenerado
    private int idCont;
    
    @NotNull
    @Size(min = 1, max = 150, message = "No cumple con la longitud")
    private String desCont;
 
    @Size(min = 1, max = 50, message = "No cumple con la longitud")
    private String email;
    
    @Size(min = 1, max = 50, message = "No cumple con la longitud")
    private String phone;
  

    public Contacto() {
    }

    public Contacto(String desCont, String email, String phone) {
        this.desCont = desCont;
        this.email = email;
        this.phone = phone;
    }

    public int getIdCont() {
        return idCont;
    }

    public void setIdCont(int idCont) {
        this.idCont = idCont;
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
