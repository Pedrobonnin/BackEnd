/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.backend.Controller;

import com.portfolio.backend.Dto.dtoRedes;
import com.portfolio.backend.Entity.Redes;
import com.portfolio.backend.Security.Controller.Mensaje;
import com.portfolio.backend.Service.SRedes;
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
@RequestMapping({"redes"})
//@CrossOrigin(origins = "http://localHost:4200/")
@CrossOrigin(origins = "https://pfportafoliofronteed.web.app/")
public class CRedes {
     @Autowired SRedes sRedes;
    
    
    @GetMapping("/listar")
    public ResponseEntity<List<Redes>> list() {
        List<Redes> list = sRedes.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<Redes> getById(@PathVariable("id") int id) {
        if (!sRedes.existById(id)) {
            return new ResponseEntity(new Mensaje("No existe"), HttpStatus.NOT_FOUND);
        }
        Redes aboutme = sRedes.getOne(id).get();
        return new ResponseEntity(aboutme, HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoRedes dtoredes) {
        if (StringUtils.isBlank(dtoredes.getUrlRed())) {
            return new ResponseEntity(new Mensaje("Es obligatorio ingresar un campo"), HttpStatus.BAD_REQUEST);
        }
        
        Redes redes = new Redes(dtoredes.getUrlRed(),dtoredes.getUrlRedImg());
        sRedes.save(redes);

        return new ResponseEntity(new Mensaje("Creación exitosa"), HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoRedes dtoredes) {
        //valida si existe el id
        if (!sRedes.existById(id)) {
            return new ResponseEntity(new Mensaje("El ID no Existe"), HttpStatus.BAD_REQUEST);
        }
        //el campo no puede estar vacio
        if (StringUtils.isBlank(dtoredes.getUrlRed())) {
            return new ResponseEntity(new Mensaje("El campo es obligatorio"), HttpStatus.BAD_REQUEST);
        }
        //si pasa validaciones recien aca actualiza el objeto
        Redes redes= sRedes.getOne(id).get();
        redes.setUrlRed(dtoredes.getUrlRed());
        redes.setUrlRedImg(dtoredes.getUrlRedImg());
      

        sRedes.save(redes);
        return new ResponseEntity(new Mensaje("Redes actualizado"), HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        //valida si existe el id
        if (!sRedes.existById(id)) {
            return new ResponseEntity(new Mensaje("El ID no Existe"), HttpStatus.BAD_REQUEST);
        }

        sRedes.delete(id);

        return new ResponseEntity(new Mensaje("Texto eliminado"), HttpStatus.OK);
    }
}
