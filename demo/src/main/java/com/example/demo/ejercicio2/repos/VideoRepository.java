package com.example.demo.ejercicio2.repos;

import com.example.demo.ejercicio2.model.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video, Long> {
}
