/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.backend.Service;

import com.portfolio.backend.Entity.Contacto;
import com.portfolio.backend.Repository.RContacto;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author bonni
 */
@Service
@Transactional
public class SContacto {
    @Autowired
    RContacto rContacto;

    public List<Contacto> list() {
        return rContacto.findAll();
    }

    public Optional<Contacto> getOne(int id) {
        return rContacto.findById(id);
    }

    public void save(Contacto contacto) {
        rContacto.save(contacto);
    }

    public void delete(int id) {
        rContacto.deleteById(id);
    }

    public boolean existById(int id) {
        return rContacto.existsById(id);
    }
}
