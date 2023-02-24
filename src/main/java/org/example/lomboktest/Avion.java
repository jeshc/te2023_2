package org.example.lomboktest;

public class Avion {
    private String color;
    private String empresa;
    private int capacidad;
    private int modelo;
    private int numeroMotores;
    private int largo;
    private boolean comercial;
    private double precio;

    public Avion() {
    }

    public Avion(String color, String empresa, int capacidad, int modelo, int numeroMotores, int largo, boolean comercial, double precio) {
        this.color = color;
        this.empresa = empresa;
        this.capacidad = capacidad;
        this.modelo = modelo;
        this.numeroMotores = numeroMotores;
        this.largo = largo;
        this.comercial = comercial;
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getNumeroMotores() {
        return numeroMotores;
    }

    public void setNumeroMotores(int numeroMotores) {
        this.numeroMotores = numeroMotores;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public boolean isComercial() {
        return comercial;
    }

    public void setComercial(boolean comercial) {
        this.comercial = comercial;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Avion{" +
                "color='" + color + '\'' +
                ", empresa='" + empresa + '\'' +
                ", capacidad=" + capacidad +
                ", modelo=" + modelo +
                ", numeroMotores=" + numeroMotores +
                ", largo=" + largo +
                ", comercial=" + comercial +
                ", precio=" + precio +
                '}';
    }
}
