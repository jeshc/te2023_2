package org.example.jacksontest;

public class DriverMarshaling {
    public static void main(String[] args) {
        Libro libro = new Libro("EL Hobbit", "J.R. Tolkien jr.", 2000);
        try{
            //LibroArchivo.guardarLibro(libro, "libroHobbit.txt");
            System.out.println("_--------------");
            LibroArchivo.mostrarLibro("libroHobbit.txt");
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
