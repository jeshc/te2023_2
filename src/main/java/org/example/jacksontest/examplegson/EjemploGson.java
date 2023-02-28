package org.example.jacksontest.examplegson;

import com.google.gson.Gson;
import org.example.jacksontest.Libro;

public class EjemploGson {
    public static void main(String[] args) {
        Libro libro = new Libro("El Hobbit", "J.R. Tolkien jr.", 2000);
        String strBook = new Gson().toJson(libro);
        System.out.println(libro);
        System.out.println(strBook);


        Libro libroRecuperado = new Gson().fromJson(strBook , Libro.class);
        System.out.println(libroRecuperado);
        System.out.println(libroRecuperado.getTitulo());
    }
}
