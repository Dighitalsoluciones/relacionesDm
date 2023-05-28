
package com.dighital.relaciones.services;

import com.dighital.relaciones.entities.Autor;
import com.dighital.relaciones.repositories.IAutorRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class AutorService {
    
    @Autowired
    IAutorRepository iAutorRepository;
    
    public List<Autor> list(){
    List<Autor> autor = iAutorRepository.findAll();
    return autor;
   }
    
    public void saveAutor(Autor autor){
        iAutorRepository.save(autor);
    }
    
    public void deleteAutor(Long id){
        iAutorRepository.deleteById(id);
    }
    
    public Optional<Autor> getAutor(Long id){
       return iAutorRepository.findById(id);
    }
}


