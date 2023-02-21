package org.example.singenericos;

import java.util.Arrays;

public class CajaCarton {
    public static final int CAPACIDAD = 10;
    private Object[] content;

    public CajaCarton() {
        content = new Object[CAPACIDAD];
    }

    public CajaCarton(Object[] content) {
        this.content = content;
    }

    public Object[] getContent() {
        return content;
    }

    public void setContent(Object[] content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "CajaCarton{" +
                "content=" + Arrays.toString(content) +
                '}';
    }

    public void add(int posicion, Object objeto){
        if (posicion < CAPACIDAD && posicion >= 0){
            content[posicion] = objeto;
        }
    }

    public Object get(int posicion) throws IndexOutOfBoundsException{
        return content[posicion];
    }

}
