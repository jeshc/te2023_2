package org.example.colecciones.listas;

import java.util.HashMap;

public class EjemploHashMap {
    public static void main(String[] args) {
        HashMap<String, Pais> hashMap = new HashMap<>();

        hashMap.put("mx", new Pais("México","América"));
        hashMap.put("us", new Pais("EU","América"));
        hashMap.put("fr", new Pais("Francia","Europa"));
        System.out.println(hashMap);
        System.out.println("{");
        hashMap.forEach((x,y)->{
            System.out.println("'" +x + "' : " + y);
        });
        System.out.println("}");

    }
}
