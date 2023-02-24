package org.example.lomboktest;

public class AvionDriver {
    public static void main(String[] args) {
        Avion miAvion = new Avion("blanco" ,"Volaris" ,120, 2019, 2 , 150 , true, 31232133.2 );
        System.out.println(miAvion);
        AvionLombok miAvion2 = new AvionLombok("blanco" ,"Volaris" ,120, 2019, 2 , 150 , true, 31232133.2 );
        System.out.println(miAvion2);
        miAvion2.setColor("Rojo");
        System.out.println(miAvion2);
    }
}
