package com.alura.biblioteca.repository;

import com.alura.biblioteca.models.bd.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepository extends JpaRepository<Libro, Long> {

    Libro findByTitulo(String titulo);
}
