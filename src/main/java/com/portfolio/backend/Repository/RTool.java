/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.backend.Repository;

import com.portfolio.backend.Entity.Tool;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author bonni
 */
@Repository
public interface RTool extends JpaRepository<Tool, Integer>{
    
//public Optional<Tool> findByTool(String tool);
//public boolean existsByTool(String tool);
    
}
