/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.backend.Controller;

import com.portfolio.backend.Dto.dtoTool;
import com.portfolio.backend.Entity.Tool;
import com.portfolio.backend.Security.Controller.Mensaje;
import com.portfolio.backend.Service.STool;
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
@RequestMapping({"tool"})
//@CrossOrigin(origins = "http://localHost:4200/")
@CrossOrigin(origins = "https://pfportafoliofronteed.web.app/")
public class CTool {
     @Autowired STool sTool;
    
    
    @GetMapping("/listar")
    public ResponseEntity<List<Tool>> list() {
        List<Tool> list = sTool.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<Tool> getById(@PathVariable("id") int id) {
        if (!sTool.existById(id)) {
            return new ResponseEntity(new Mensaje("No existe"), HttpStatus.NOT_FOUND);
        }
        Tool tool = sTool.getOne(id).get();
        return new ResponseEntity(tool, HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoTool dtotool) {
        if (StringUtils.isBlank(dtotool.getTool())) {
            return new ResponseEntity(new Mensaje("Es obligatorio ingresar un campo"), HttpStatus.BAD_REQUEST);
        }
        
        Tool tool = new Tool(dtotool.getTool());
        sTool.save(tool);

        return new ResponseEntity(new Mensaje("Creación exitosa"), HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoTool dtotool) {
        //valida si existe el id
        if (!sTool.existById(id)) {
            return new ResponseEntity(new Mensaje("El ID no Existe"), HttpStatus.BAD_REQUEST);
        }
        //el campo no puede estar vacio
        if (StringUtils.isBlank(dtotool.getTool())) {
            return new ResponseEntity(new Mensaje("El campo es obligatorio"), HttpStatus.BAD_REQUEST);
        }
        //si pasa validaciones recien aca actualiza el objeto
        Tool tool= sTool.getOne(id).get();
        tool.setTool(dtotool.getTool());
      

        sTool.save(tool);
        return new ResponseEntity(new Mensaje("Tool actualizado"), HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        //valida si existe el id
        if (!sTool.existById(id)) {
            return new ResponseEntity(new Mensaje("El ID no Existe"), HttpStatus.BAD_REQUEST);
        }

        sTool.delete(id);

        return new ResponseEntity(new Mensaje("Texto eliminado"), HttpStatus.OK);
    }
}
