package com.example.demo.ejercicio1.repos;

import com.example.demo.ejercicio1.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
