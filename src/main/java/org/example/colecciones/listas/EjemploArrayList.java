package org.example.colecciones.listas;

import org.example.con.genericos.Comida;

import java.util.ArrayList;
import java.util.Collections;

public class EjemploArrayList {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Jose");
        nombres.add("Marcos");
        nombres.add("Diana");
        nombres.add("Diego");
        System.out.println(nombres);
        nombres.add(1, "Jesus");
        System.out.println(nombres);
        System.out.println(nombres.size());
        String nom = nombres.get(1);
        System.out.println(nom);
        nombres.set(1, "María");
        System.out.println(nombres);

        System.out.println(nombres);

        Libro libro = new Libro("El perfume",
                "Patrik Süskind",
                new Editorial("Planeta",
                        new Pais("España", "Europa"))
        );
        System.out.println(libro);
        ArrayList<Libro> biblioteca = new ArrayList<>();
        biblioteca.add(libro);
        biblioteca.add(new Libro("Mist born",
                "Brandon Sandersson",
                new Editorial("Planeta",
                        new Pais("España", "Europa"))
        ));
        Libro libro2 = new Libro("El señor de los anillos",
                "J. R. Tolkien",
                new Editorial("Punto de lectura",
                        new Pais("Mexico", "America"))
        );
        biblioteca.add(libro2);
        System.out.println(biblioteca);

        int indice = biblioteca.indexOf(libro2);
        System.out.println("indice de libro es: " + indice);
        biblioteca.forEach((x)->{
            System.out.println(x);
        });
        System.out.println("--- nombres oredenados ---");
        Collections.reverse(nombres);
        System.out.println(nombres);


    }

}
