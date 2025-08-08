package dev.yolanda.models;

import java.util.ArrayList;

public class Gestor {

    private ArrayList<String> semana = new ArrayList<>();
    
    public void crearLista() {

        semana.add("Lunes");
        semana.add("Martes");
        semana.add("Miércoles");
        semana.add("Jueves");
        semana.add("Viernes");
        semana.add("Sábado");
        semana.add("Domingo");


        //ArrayList <String> semana = new ArrayList<>(Arrays.asList("Lunes", "Martes","Miércoles", "Jueves", "Viernes", "Sábado","Domingo" ));

    }

    public void imprimirDias() {
        System.out.println("Días de la semana:");
        for (String dia : semana) {
            System.out.println(dia);
        }
    }
}
