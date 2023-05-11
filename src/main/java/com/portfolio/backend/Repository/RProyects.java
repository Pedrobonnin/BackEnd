
package com.portfolio.backend.Repository;

import com.portfolio.backend.Entity.Proyect;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RProyects extends JpaRepository<Proyect, Integer>{
    
    public Optional<Proyect> findByNameProy(String nameProy);
    public boolean existsByNameProy(String nameProy);
}
