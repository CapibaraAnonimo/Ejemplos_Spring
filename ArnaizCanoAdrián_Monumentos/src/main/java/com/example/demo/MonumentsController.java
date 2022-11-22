package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class MonumentsController {
    private MonumentsRepository repo;

    @GetMapping("/monumento/")
    public ResponseEntity<Monument> getAllmonuments() {
        //return ResponseEntity.of(repo.findAll());
        return null;
    }

    @GetMapping("/monumento/{id}")
    public ResponseEntity<Monument> getMonumentByID(@PathVariable long id) {
        return ResponseEntity.of(repo.findById(id));
    }

    @PostMapping("/monumento/")
    public ResponseEntity<Monument> createMonument(@RequestBody Monument monument) {
        repo.save(monument);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping("/monumento/{id}")
    public ResponseEntity<Monument> modifyMonument(@RequestBody Monument monument, @PathVariable long id) {
        if (repo.existsById(id)) {
            repo.findById(id).map(old -> {
                old.setCode(monument.getCode());
                old.setCountryName(monument.getCountryName());
                old.setCityName(monument.getCityName());
                old.setName(monument.getName());
                old.setDescription(monument.getDescription());
                old.setPhotoURL(monument.getPhotoURL());
                old.setLat(monument.getLat());
                old.setLon(monument.getLon());
                return repo.save(old);
            });
            return ResponseEntity.status(HttpStatus.OK).build();
        } else
            return ResponseEntity.status((HttpStatus.NOT_MODIFIED)).build();
    }

    @DeleteMapping("/monumento/{id}")
    public ResponseEntity<Monument> deleteMonument(@PathVariable long id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        } else
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }
}
