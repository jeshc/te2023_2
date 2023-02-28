package org.example.jacksontest;

import java.io.*;

public class LibroArchivo {

    public static void guardarLibro(Libro libro, String archivo) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(archivo);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(libro);
        objectOutputStream.close();
    }
    public static void mostrarLibro(String archivo) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(archivo);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Libro libro = (Libro) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println("Recuperdo : " + libro);
        libro.setAutor("Yo mero");
        System.out.println("Recuperdo : " + libro);

    }
}
