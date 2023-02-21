package org.example.colecciones.listas;

import org.example.con.genericos.Comida;

import java.util.ArrayList;

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
        System.out.println( nombres.size() );
        String nom = nombres.get(1);
        System.out.println(nom);
        nombres.set(1, "María");
        System.out.println(nombres);
        nombres.clear();
        System.out.println(nombres);

        Libro libro = new Libro("El perfume",
                "Patrik Süskind",
                new Editorial("Planeta" ,
                        new Pais("España", "Europa"))
                );
        System.out.println(libro);
        ArrayList<Libro> biblioteca = new ArrayList<>();
        biblioteca.add(libro);
        biblioteca.add(new Libro("Mist born",
                "Brandon Sandersson",
                new Editorial("Planeta" ,
                        new Pais("España", "Europa"))
        ));

        System.out.println(biblioteca);

    }

}
