package com.alura.biblioteca.principal;

import com.alura.biblioteca.models.Datos;
import com.alura.biblioteca.service.ConsumoAPI;
import com.alura.biblioteca.service.ConvierteDatos;

import java.util.Scanner;

public class Principal {
    private  static String URL = "https://gutendex.com/books/?search=";
    private ConsumoAPI consumoAPI = new ConsumoAPI();
    private ConvierteDatos convierteDatos = new ConvierteDatos();
    private Scanner teclado = new Scanner(System.in);

    public void muestraMenu() {
        buscarPorTitulo("quijote");
    }

    public void buscarPorTitulo(String titulo) {
        var json = consumoAPI.obtenerDatos(URL + titulo);
        var datos = convierteDatos.obtenerDatos(json, Datos.class);
        System.out.println(json);

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
