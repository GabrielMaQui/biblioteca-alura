package com.alura.biblioteca.models.bd;


import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
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
