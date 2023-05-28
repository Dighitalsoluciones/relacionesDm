
package com.dighital.relaciones.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Libros")
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String paginas;
    private String portada;
    private Autor autor;

    public Libro() {
    }

    public Libro(String titulo, String paginas, String portada, Autor autor) {
        this.titulo = titulo;
        this.paginas = paginas;
        this.portada = portada;
        this.autor = autor;
    }
    
    
}
