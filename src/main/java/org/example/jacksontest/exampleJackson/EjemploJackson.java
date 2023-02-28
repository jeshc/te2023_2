package org.example.jacksontest.exampleJackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.jacksontest.Libro;

public class EjemploJackson {
    public static void main(String[] args) {
        Libro libro = new Libro("EL Hobbit", "JR Tolkien jr.", 2000);
        ObjectMapper mapeador = new ObjectMapper();
        try {
            String strLibro = mapeador.writeValueAsString(libro);
            System.out.println(strLibro);
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
