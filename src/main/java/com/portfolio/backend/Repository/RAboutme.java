
package com.portfolio.backend.Repository;

import com.portfolio.backend.Entity.AboutMe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RAboutme extends JpaRepository<AboutMe, Integer>{
    
}
