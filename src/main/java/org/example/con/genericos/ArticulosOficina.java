package org.example.con.genericos;

public class ArticulosOficina {
    private float precio;
    private String nombre;

    public ArticulosOficina() {
    }

    public ArticulosOficina(float precio, String nombre) {
        this.precio = precio;
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    @Override
    public String toString() {
        return "ArticulosOficina{" +
                "precio=" + precio +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
