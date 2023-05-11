/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.backend.Service;


import com.portfolio.backend.Entity.Tool;
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
public class STool {
    @Autowired
    RTool rTool;

    public List<Tool> list() {
        return rTool.findAll();
    }

    public Optional<Tool> getOne(int id) {
        return rTool.findById(id);
    }

    public void save(Tool tool) {
        rTool.save(tool);
    }

    public void delete(int id) {
        rTool.deleteById(id);
    }

    public boolean existById(int id) {
        return rTool.existsById(id);
    }
}
