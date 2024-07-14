package com.alura.biblioteca.models.bd;

import jakarta.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "libro")
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "title")
    String titulo;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(
            name = "libro_autor",
            joinColumns = @JoinColumn(name = "libro_id"),
            inverseJoinColumns = @JoinColumn(name = "autor_id")
    )
    List<Autor> autores;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "libro_idiomas", joinColumns = @JoinColumn(name = "libro_id"))
    @Column(name = "languages")
    List<String> idiomas;

    @Column(name = "download_count")
    Double numeroDeDescargas;

    public Libro(String titulo, List<Autor> autores, List<String> idiomas, Double numeroDeDescargas ) {
        this.idiomas = idiomas;
        this.numeroDeDescargas = numeroDeDescargas;
        this.titulo = titulo;
        this.autores = autores;
    }

    @Override
    public String toString() {
        StringBuilder autoresStr = new StringBuilder();
        for (Autor autor : autores) {
            if (autoresStr.length() > 0) autoresStr.append(", ");
            autoresStr.append(autor.getNombre());
        }

        return "------ LIBRO ------\n" +
                "Título: " + titulo + "\n" +
                "Autor: " + autoresStr + "\n" +
                "Idioma: " + String.join(", ", idiomas) + "\n" +
                "Número de descargas: " + numeroDeDescargas + "\n" +
                "-------------------";
    }
}
