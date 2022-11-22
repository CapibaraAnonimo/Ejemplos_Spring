package com.example.tallerdtos.repositorios;

import com.example.tallerdtos.modelos.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaRepositorio extends CrudRepository<Persona, String> {

}
