package org.example.lomboktest;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
@Setter
public class AvionLombok {
    private String color;
    private String empresa;
    private int capacidad;
    private int modelo;
    private int numeroMotores;
    private int largo;
    private boolean comercial;
    private double precio;

}
