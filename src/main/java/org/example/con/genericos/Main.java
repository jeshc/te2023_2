package org.example.con.genericos;


public class Main {
    public static void main(String[] args) {
        CajaCarton<Comida> caja = new CajaCarton<>();
        Comida zanahoria = new Comida("Zanahoria",false);
        Comida yogurth = new Comida("griego",true);
        caja.add(0, zanahoria);
        caja.add(1, yogurth);
        for (Comida com: caja.getContent() ) {
            System.out.println(com);
        }

        CajaCarton<ArticulosOficina> cajaDos = new CajaCarton<>();
        cajaDos.add(0, new ArticulosOficina( 56.5f , "Cuaderno") );
        cajaDos.add(1, new ArticulosOficina( 3.0f , "goma") );
        ArticulosOficina tmp = cajaDos.get(1);

    }
}