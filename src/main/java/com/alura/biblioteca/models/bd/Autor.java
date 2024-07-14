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
    @ManyToMany(mappedBy = "autores", fetch = FetchType.EAGER)
    private List<Libro> libros;

    public Autor(String nombre, String s, String s1) {
        this.nombre = nombre;
        if(s == null){
            this.fechaNacimiento = 0;
        } else {
            this.fechaNacimiento = Integer.valueOf(s);
        }


        if(s1 == null){
            this.fechaDefuncion = 0;
        }
        else {
            this.fechaDefuncion = Integer.valueOf(s1);
        }

    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Autor: ").append(nombre).append("\n");
        sb.append("Fecha de nacimiento: ").append(fechaNacimiento).append("\n");
        sb.append("Fecha de fallecimiento: ").append(fechaDefuncion).append("\n");
        sb.append("Libros: [");
        for (int i = 0; i < libros.size(); i++) {
            sb.append(libros.get(i).getTitulo());
            if (i < libros.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
