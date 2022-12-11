package com.example.demo.ejercicio2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class Profesor {
    @Id
    @GeneratedValue
    private Long id;

    private String nombre;

    private String email;

    private Double puntuacion;

    @OneToMany(mappedBy = "profesor")
    @Builder.Default
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private List<CursoOnline> cursos = new ArrayList<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Profesor profesor = (Profesor) o;
        return id.equals(profesor.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

//    @Override
//    public String toString() {
//        return "Profesor{" +
//                "id=" + id +
//                ", nombre='" + nombre + '\'' +
//                ", email='" + email + '\'' +
//                ", puntuacion=" + puntuacion +
//                ", cursos=" + cursos +
//                '}';
//    }
}
