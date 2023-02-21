package org.example.con.genericos;

import java.util.Arrays;

public class CajaCarton<T> {
    public static final int CAPACIDAD = 10;

    private T[] content;

    public CajaCarton() {
    }

    public CajaCarton(T[] content) {
        this.content = content;
    }

    public T[] getContent() {
        return content;
    }

    public void setContent(T[] content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "CajaCarton{" +
                "content=" + Arrays.toString(content) +
                '}';
    }

    public void add(int posicion, T objeto){
        if (posicion < CAPACIDAD && posicion >= 0){
            content[posicion] = objeto;
        }
    }

    public T get(int posicion) throws IndexOutOfBoundsException{
        return content[posicion];
    }

}
