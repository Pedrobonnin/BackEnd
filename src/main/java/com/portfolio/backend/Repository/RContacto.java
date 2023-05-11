/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.backend.Repository;

import com.portfolio.backend.Entity.Contacto;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author bonni
 */
public interface RContacto extends JpaRepository<Contacto, Integer>{
    
}
