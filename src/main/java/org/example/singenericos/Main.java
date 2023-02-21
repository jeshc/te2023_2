package org.example.singenericos;

public class Main {
    public static void main(String[] args) {
        CajaCarton caja = new CajaCarton();
        Comida zanahoria = new Comida("Zanahorias", false);
        Comida yogurth = new Comida("Yogurth griego", true);
        caja.add(0, zanahoria);
        caja.add(1,yogurth);
        for (Object objeto : caja.getContent() ) {
            Comida com = (Comida) objeto;
            System.out.println(com);
        }

    }
}