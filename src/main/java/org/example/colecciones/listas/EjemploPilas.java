package org.example.colecciones.listas;

import java.util.ArrayDeque;
import java.util.Stack;

public class EjemploPilas {
    public static void main(String[] args) {
        Stack<String> pila = new Stack<>();
        pila.push("José");
        pila.push("María");
        pila.push("Jesús");
        pila.push("E.S.");
        System.out.println(pila.peek());
        System.out.println("--------");
        System.out.println(pila);
        System.out.println(".-.-.-.");
        System.out.println(pila.pop());
        System.out.println(pila);
        ArrayDeque<String> test = new ArrayDeque<>();
        System.out.println(".-,-,--");
        Stack<Pais> paisStack = new Stack<>();
        paisStack.push(new Pais("México","America"));
        paisStack.push(new Pais("EU","America"));
        paisStack.push(new Pais("España","Europa"));
        paisStack.push(new Pais("Ukrania","Europa"));
        System.out.println(paisStack);

    }
}
