
package com.dighital.relaciones.repositories;

import com.dighital.relaciones.entities.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILibroRepository extends JpaRepository<Libro, Long> {
    
}
