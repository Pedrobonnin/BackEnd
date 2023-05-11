/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.backend.Controller;

import com.portfolio.backend.Dto.dtoContacto;
import com.portfolio.backend.Entity.Contacto;
import com.portfolio.backend.Security.Controller.Mensaje;
import com.portfolio.backend.Service.SContacto;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author bonni
 */

@RestController
@RequestMapping({"contacto"})
@CrossOrigin(origins = "http://localHost:4200/")
public class CContacto {
    @Autowired SContacto sContacto;
    
    
    @GetMapping("/listar")
    public ResponseEntity<List<Contacto>> list() {
        List<Contacto> list = sContacto.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<Contacto> getById(@PathVariable("id") int id) {
        if (!sContacto.existById(id)) {
            return new ResponseEntity(new Mensaje("No existe"), HttpStatus.NOT_FOUND);
        }
        Contacto contacto = sContacto.getOne(id).get();
        return new ResponseEntity(contacto, HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoContacto dtocontacto) {
        if (StringUtils.isBlank(dtocontacto.getDesCont())) {
            return new ResponseEntity(new Mensaje("Es obligatorio ingresar un campo"), HttpStatus.BAD_REQUEST);
        }
        
        Contacto contacto = new Contacto(dtocontacto.getDesCont(),dtocontacto.getEmail(),dtocontacto.getPhone());
        sContacto.save(contacto);

        return new ResponseEntity(new Mensaje("Creación exitosa"), HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoContacto dtocontacto) {
        //valida si existe el id
        if (!sContacto.existById(id)) {
            return new ResponseEntity(new Mensaje("El ID no Existe"), HttpStatus.BAD_REQUEST);
        }
        //el campo no puede estar vacio
        if (StringUtils.isBlank(dtocontacto.getDesCont())) {
            return new ResponseEntity(new Mensaje("El campo es obligatorio"), HttpStatus.BAD_REQUEST);
        }
        //si pasa validaciones recien aca actualiza el objeto
        Contacto contacto= sContacto.getOne(id).get();
        contacto.setDesCont(dtocontacto.getDesCont());
        contacto.setEmail(dtocontacto.getEmail());
        contacto.setPhone(dtocontacto.getPhone());
       
      

        sContacto.save(contacto);
        return new ResponseEntity(new Mensaje("Contacto actualizado"), HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        //valida si existe el id
        if (!sContacto.existById(id)) {
            return new ResponseEntity(new Mensaje("El ID no Existe"), HttpStatus.BAD_REQUEST);
        }

        sContacto.delete(id);

        return new ResponseEntity(new Mensaje("Texto eliminado"), HttpStatus.OK);
    }
}
