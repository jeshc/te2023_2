package org.example.jacksontest.examplegson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

public class DriverComputadora {
    public static void main(String[] args) {
        Computadora compu = new Computadora();
        compu.setMarca("Apple");
        compu.setModelo("Mac book pro");
        compu.setCpu(new Procesador("Appe","M1",3.4f));
        compu.getCpu().setFrecuencia(4.1f);
        System.out.println(compu);

        String strCompu = new Gson().toJson(compu);
        System.out.println("------ resultado ----");
        System.out.println(strCompu);
        System.out.println(" --- str to Cmpu--- ");
        String cadena = "{\"marca\":\"Asus\",\"precio\":33444.0,\"modelo\":\"Vivo book\",\"cpu\":{\"marca\":\"Intel\",\"modelo\":\"i9\",\"frecuencia\":6.1}}";
        Computadora c2 = new Gson().fromJson(cadena, Computadora.class);
        System.out.println(c2);
        System.out.println(c2.getCpu());
        ObjectMapper mapeador = new ObjectMapper();
        try {
            String strC2 = mapeador.writeValueAsString(c2);
            System.out.println(strC2);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
