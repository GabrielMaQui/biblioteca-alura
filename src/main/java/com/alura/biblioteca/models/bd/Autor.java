package com.alura.biblioteca.models.bd;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "autor")
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String nombre;
    @Column(name = "birth_year")
    private Integer fechaNacimiento;
    @Column(name = "death_year")
    private Integer fechaDefuncion;
    @ManyToMany(mappedBy = "autores")
    private List<Libro> libros;

    public Autor(String nombre, String s, String s1) {
        this.nombre = nombre;
        this.fechaNacimiento = Integer.valueOf(s1);
        this.fechaDefuncion = Integer.valueOf(s1);
    }


    @Override
    public String toString() {
        return "Autor{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", fechaDefuncion=" + fechaDefuncion +
                '}';
    }
}
