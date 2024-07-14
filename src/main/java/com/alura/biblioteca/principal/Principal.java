package com.alura.biblioteca.principal;

import com.alura.biblioteca.models.Datos;
import com.alura.biblioteca.models.DatosLibros;
import com.alura.biblioteca.models.bd.Autor;
import com.alura.biblioteca.models.bd.Libro;
import com.alura.biblioteca.service.ConsumoAPI;
import com.alura.biblioteca.service.ConvierteDatos;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Principal {
    private static final String URL = "https://gutendex.com/books/?search=";
    private final ConsumoAPI consumoAPI = new ConsumoAPI();
    private final ConvierteDatos convierteDatos = new ConvierteDatos();
    private final Scanner teclado = new Scanner(System.in);

    public void muestraMenu() {
        buscarPorTitulo("quijote");
    }

    public void buscarPorTitulo(String titulo) {
        var json = consumoAPI.obtenerDatos(URL + titulo.replace(" ", "+"));
        var datos = convierteDatos.obtenerDatos(json, Datos.class);
        //System.out.println(datos);
        Optional<DatosLibros> librosBuscado = datos.libros().stream()
                .filter(l -> l.titulo().toUpperCase().contains(titulo.toUpperCase()))
                .findFirst();

        if (librosBuscado.isPresent()) {
            List<Autor> autors = librosBuscado.get().autor().stream()
                    .map(a -> new Autor(a.nombre(), a.fechaDeNacimiento(), a.fechaDeDefuncion()))
                    .toList();
            Libro libroNuevo = new Libro(librosBuscado.get().titulo(), autors,
                                        librosBuscado.get().idiomas(), librosBuscado.get().numeroDeDescargas());
            System.out.println(libroNuevo.toString());
        }
        else{
            System.out.println("Libro no encontrado");
        }
    }


    public void menu() {
        System.out.println("Elija la opción a través de su número: ");
        System.out.println("1. Buscar libro por titulo");
        System.out.println("2. Listar libros registrados");
        System.out.println("3. Listar autores registrados");
        System.out.println("4. Listar autores vivos en un determinado año");
        System.out.println("5. Listar libros por idioma");
        System.out.println("0. Salir");
    }
}
