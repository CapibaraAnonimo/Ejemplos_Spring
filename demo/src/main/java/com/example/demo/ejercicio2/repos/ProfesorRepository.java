package com.example.demo.ejercicio2.repos;

import com.example.demo.ejercicio2.model.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfesorRepository extends JpaRepository<Profesor, Long> {
}
