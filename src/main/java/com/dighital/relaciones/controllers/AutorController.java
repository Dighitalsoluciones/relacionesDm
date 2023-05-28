
package com.dighital.relaciones.controllers;

import com.dighital.relaciones.services.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/autor")
@CrossOrigin(origins = "http://localhost:4200")
public class AutorController {
    
    @Autowired
    AutorService autorService;
    
    @GetMapping("/lista")
    
}
