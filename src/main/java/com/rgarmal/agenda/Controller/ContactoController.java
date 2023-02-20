package com.rgarmal.agenda.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import com.rgarmal.agenda.models.Contacto;
import com.rgarmal.agenda.services.ContactoService;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class ContactoController {
    
    @Autowired
    ContactoService service;

    @GetMapping("/contactos")
    List<Contacto> all() {
        return service.findAll(); 
    }

    @GetMapping("/contactos/{id}")
    Contacto fiContacto(@PathVariable int id) {
        return service.findById(id);
    }

    @DeleteMapping("/contactos/{id}")
    void deleteContacto(@PathVariable int id) {
        service.deleteById(id);
    }

    @PostMapping("/contactos")
    Contacto nuevoContacto(@RequestBody Contacto contacto) {
        return service.save(contacto);
    }

    @PutMapping("/contactos/{id}")
    void modificarContacto(@PathVariable int id,@RequestBody Contacto contacto){
        service.update(id,contacto);
    }
}
