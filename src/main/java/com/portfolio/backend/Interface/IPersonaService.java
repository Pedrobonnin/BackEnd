package com.portfolio.backend.Interface;

import com.portfolio.backend.Entity.AboutMe;
import com.portfolio.backend.Entity.Persona;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public interface IPersonaService {
   
    //Traer una lista de personas
    public List<Persona> getPersona();
    
    //Guardar un objeto de tipo persona
    public void savePersona(Persona persona);
    
    //Eliminar un usuario buscado por Id
    public void deletePersona(Long id);
    
    //Buscar una persona por id
    public Persona findPersona (Long id);
    
   
}
