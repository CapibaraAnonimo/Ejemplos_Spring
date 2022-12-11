package com.example.demo;

import com.example.demo.ejercicio1.model.Categoria;
import com.example.demo.ejercicio1.model.Producto;
import com.example.demo.ejercicio1.repos.CategoriaRepository;
import com.example.demo.ejercicio1.repos.ProductoRepository;
import com.example.demo.ejercicio2.model.CursoOnline;
import com.example.demo.ejercicio2.model.Profesor;
import com.example.demo.ejercicio2.model.Video;
import com.example.demo.ejercicio2.repos.CursoOnlineRepository;
import com.example.demo.ejercicio2.repos.ProfesorRepository;
import com.example.demo.ejercicio2.repos.VideoRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MainDePrueba {
    private final ProductoRepository productoRepository;
    private final CategoriaRepository categoriaRepository;

    private final ProfesorRepository profesorRepository;
    private final CursoOnlineRepository cursoOnlineRepository;
    private final VideoRepository videoRepository;

    @PostConstruct
    public void test() {
        Categoria informatica = Categoria.builder().nombre("Informática").build();
        categoriaRepository.save(informatica);
        Categoria ordenadores = Categoria.builder().nombre("ordenadores").categoriaPadre(informatica).build();
        categoriaRepository.save(ordenadores);

        Producto hp = Producto.builder().nombre("hp").pvp(800).categoria(ordenadores).build();
        productoRepository.save(hp);

        Producto mac = Producto.builder().nombre("mac").pvp(2000).categoria(ordenadores).build();
        productoRepository.save(mac);

        System.out.println(hp);
        System.out.println(mac);


        Profesor profesor1 = Profesor.builder().nombre("Luis Miguel").email("email").puntuacion(4.5).build();
        profesorRepository.save(profesor1);

        Video v1 = Video.builder().orden(1).titulo("Titulo1").descripcion("Descripción1").url("url1").build();
        Video v2 = Video.builder().orden(2).titulo("Titulo2").descripcion("Descripción2").url("url2").build();
        Video v3 = Video.builder().orden(3).titulo("Titulo3").descripcion("Descripción3").url("url3").build();
        Video v4 = Video.builder().orden(4).titulo("Titulo4").descripcion("Descripción4").url("url4").build();

        CursoOnline curso1 = CursoOnline.builder().nombre("Curso1").puntuacion(4.3).build();

        v1.addCursoOnline(curso1);
        v2.addCursoOnline(curso1);
        v3.addCursoOnline(curso1);
        v4.addCursoOnline(curso1);

        curso1.addProfesor(profesor1);

        cursoOnlineRepository.save(curso1);

        videoRepository.save(v1);
        videoRepository.save(v2);
        videoRepository.save(v3);
        videoRepository.save(v4);

        System.out.println(profesor1);
        System.out.println(curso1);
        System.out.println(v1);
    }
}
