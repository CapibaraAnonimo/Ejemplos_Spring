package com.example.demo.ejercicio2.model;

import jakarta.persistence.*;
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
public class CursoOnline {
    @Id
    @GeneratedValue
    private Long id;

    private String nombre;

    private Double puntuacion;

    @ManyToOne
    private Profesor profesor;

    @OneToMany(mappedBy = "cursoOnline")
    @Builder.Default
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private List<Video> videos = new ArrayList<>();

    public void addProfesor (Profesor p) {
        this.profesor = p;
        p.getCursos().add(this);
    }

    public void removeProfesor (Profesor p) {
        p.getCursos().remove(this);
        this.profesor = null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CursoOnline that = (CursoOnline) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

//    @Override
//    public String toString() {
//        return "CursoOnline{" +
//                "id=" + id +
//                ", nombre='" + nombre + '\'' +
//                ", puntuacion=" + puntuacion +
//                ", profesor=" + profesor +
//                ", videos=" + videos +
//                '}';
//    }
}
