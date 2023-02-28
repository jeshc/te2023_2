package org.example.jacksontest.examplegson;

import lombok.Data;

public @Data class Computadora {
    private String marca;
    private double precio;
    private String modelo;
    private Procesador cpu;
    private Memoria ram;
}
