package org.example.colecciones.listas;

public class Editorial {
    private String nombre;
    private Pais nacion;

    public Editorial() {
    }

    public Editorial(String nombre, Pais nacion) {
        this.nombre = nombre;
        this.nacion = nacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais getNacion() {
        return nacion;
    }

    public void setNacion(Pais nacion) {
        this.nacion = nacion;
    }

    @Override
    public String toString() {
        return "Editorial{" +
                "nombre='" + nombre + '\'' +
                ", nacion=" + nacion +
                '}';
    }
}
