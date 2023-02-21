package org.example.con.genericos;

import java.util.Arrays;

public class MiDiccionario <K , V>{
    private K[] llaves;
    private V[] valores;

    private int tam;


    public MiDiccionario(K[] llaves, V[] valores) {
        this.llaves = llaves;
        this.valores = valores;
    }

    public K[] getLlaves() {
        return llaves;
    }

    public void setLlaves(K[] llaves) {
        this.llaves = llaves;
    }

    public V[] getValores() {
        return valores;
    }

    public void setValores(V[] valores) {
        this.valores = valores;
    }

    @Override
    public String toString() {
        return "MiDiccionario{" +
                "llaves=" + Arrays.toString(llaves) +
                ", valores=" + Arrays.toString(valores) +
                '}';
    }

    public void addPair(K llave, V valor){
        llaves[tam] = llave;
        valores[tam] =valor;
    }

    public static void main(String[] args) {
        MiDiccionario<String,String> diccionario =
                new MiDiccionario<>(new String[10], new String[10]);
        diccionario.addPair("nombre", "Jose");
        System.out.println(diccionario);
    }
}
