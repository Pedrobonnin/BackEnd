/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.backend.Service;

import com.portfolio.backend.Entity.Redes;
import com.portfolio.backend.Entity.Tool;
import com.portfolio.backend.Repository.RRedes;
import com.portfolio.backend.Repository.RTool;
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
public class SRedes {
    @Autowired
    RRedes rRedes;

    public List<Redes> list() {
        return rRedes.findAll();
    }

    public Optional<Redes> getOne(int id) {
        return rRedes.findById(id);
    }

    public void save(Redes redes) {
        rRedes.save(redes);
    }

    public void delete(int id) {
        rRedes.deleteById(id);
    }

    public boolean existById(int id) {
        return rRedes.existsById(id);
    }
}
