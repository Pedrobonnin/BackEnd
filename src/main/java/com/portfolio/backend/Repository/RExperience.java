
package com.portfolio.backend.Repository;

import com.portfolio.backend.Entity.Experience;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RExperience extends JpaRepository<Experience,Integer>{
    
  
}
