
package com.portfolio.backend.Entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //campo primary key autogenerado
    private int id;
    
    @NotNull
    @Size(min = 1, max = 50, message = "No cumple con la longitud")
    private String nombre;
    
    @NotNull
    @Size(min = 1, max = 50, message = "No cumple con la longitud")
    private String apellido;
    
    @NotNull
    @Size(min = 1, max = 150, message = "No cumple con la longitud")
    private String descripcion;
    
    @NotNull
    @Size(min = 1, max = 50, message = "No cumple con la longitud")
    private String profesion;
    
    @Size(min = 1, max = 255, message = "Longitud exedida")
    private String imglogo;


    @Size( max = 255, message ="Longitud exedida")
    private String cv;


    public Persona() {
    }

    public Persona(String nombre, String apellido, String descripcion, String profesion, String imglogo, String cv) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.descripcion = descripcion;
        this.profesion = profesion;
        this.imglogo = imglogo;
        this.cv = cv;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
