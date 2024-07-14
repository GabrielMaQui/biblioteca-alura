package com.alura.biblioteca.repository;

import com.alura.biblioteca.models.bd.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<Autor, Long> {
}
