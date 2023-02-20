package com.rgarmal.agenda.services;

import java.util.List;

import com.rgarmal.agenda.models.Contacto;

public interface ContactoService {

    public List<Contacto> findAll();
    public Contacto findById(int codigo);
    public Contacto save(Contacto contacto);
    public void update(int id,Contacto contacto);
    public void deleteById(int id);
    public void deleteAll();
}
