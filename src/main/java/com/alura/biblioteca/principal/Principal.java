package com.alura.biblioteca.principal;

import com.alura.biblioteca.models.Datos;
import com.alura.biblioteca.service.ConsumoAPI;
import com.alura.biblioteca.service.ConvierteDatos;

import java.util.Scanner;

public class Principal {
    private  static String URL = "https://gutendex.com/books/";
    private ConsumoAPI consumoAPI = new ConsumoAPI();
    private ConvierteDatos convierteDatos = new ConvierteDatos();
    private Scanner teclado = new Scanner(System.in);

    public void muestraMenu() {
        var json = consumoAPI.obtenerDatos(URL);
        //System.out.println(json);
        var datos = convierteDatos.obtenerDatos(json, Datos.class);
        System.out.println(datos);
    }
}
