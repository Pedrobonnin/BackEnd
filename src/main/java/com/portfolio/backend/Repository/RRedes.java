/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.backend.Repository;
import com.portfolio.backend.Entity.Redes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author bonni
 */
@Repository
public interface RRedes extends JpaRepository<Redes, Integer>{
   

    
//public Optional<Tool> findByTool(String tool);
//public boolean existsByTool(String tool);
    

}
