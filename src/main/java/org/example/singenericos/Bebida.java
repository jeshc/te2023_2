package org.example.singenericos;

public class Bebida {
    private String tipo;
    private String nombre;
    private int mililitros;

    public Bebida() {
    }

    public Bebida(String tipo, String nombre, int mililitros) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.mililitros = mililitros;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMililitros() {
        return mililitros;
    }

    public void setMililitros(int mililitros) {
        this.mililitros = mililitros;
    }

    @Override
    public String toString() {
        return "Bebida{" +
                "tipo='" + tipo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", mililitros=" + mililitros +
                '}';
    }
}
