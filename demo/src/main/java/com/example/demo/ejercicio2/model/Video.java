package com.example.demo.ejercicio2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.util.Objects;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Video {
    @Id
    @GeneratedValue
    private Long id;

    private Integer orden;

    private String titulo;

    private String descripcion;

    private String url;

    @ManyToOne
    private CursoOnline cursoOnline;

    public void addCursoOnline (CursoOnline c) {
        this.cursoOnline = c;
        c.getVideos().add(this);
    }

    public void removeCursoOnline (CursoOnline c) {
        c.getVideos().remove(this);
        this.cursoOnline = null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Video video = (Video) o;
        return id.equals(video.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Video{" +
                "id=" + id +
                ", orden=" + orden +
                ", titulo='" + titulo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", url='" + url + '\'' +
                ", cursoOnline=" + cursoOnline +
                '}';
    }
}
