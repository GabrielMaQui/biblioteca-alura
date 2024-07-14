package com.alura.biblioteca.principal;

import com.alura.biblioteca.service.ConsumoAPI;
import com.alura.biblioteca.service.ConvierteDatos;

import java.util.Scanner;

public class Principal {
    private  static String URL = "https://gutendex.com/books/";
    private ConsumoAPI consumoAPI = new ConsumoAPI();
    private ConvierteDatos convierteDatos = new ConvierteDatos();
    private Scanner teclado = new Scanner(System.in);
}
