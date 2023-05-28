
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
@Table(name = "Escritores")
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)        
    private Long id;
    private String nombre;
    private String apellido;
    
    //constructor

    public Autor() {
    }

    public Autor(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    
    
}
