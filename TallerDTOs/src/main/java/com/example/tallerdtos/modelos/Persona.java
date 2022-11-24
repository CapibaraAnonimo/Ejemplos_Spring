package com.example.tallerdtos.modelos;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@Entity
public class Persona {
    @Id
    private String id;
    private String nombre;
}
