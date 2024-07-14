package com.alura.biblioteca.models.bd;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Libro {
    @Column(name = "title")
    String titulo;
    @Column(name = "authors")
    List<Autor> autor;
    @Column(name = "languages")
    List<String> idiomas;
    @Column(name = "download_count")
    Double numeroDeDescargas;

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor=" + autor +
                ", idiomas=" + idiomas +
                ", numeroDeDescargas=" + numeroDeDescargas +
                '}';
    }
}
