package org.example.jacksontest.examplegson;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
public @Data class Procesador {
    private String marca;
    private String modelo;
    private float frecuencia; // GHz

}
