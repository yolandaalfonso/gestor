package dev.yolanda.models;

import java.util.ArrayList;

public class Gestor {

    private ArrayList<String> semana = new ArrayList<>();
    
    public void createList() {

        semana.add("Lunes");
        semana.add("Martes");
        semana.add("Miércoles");
        semana.add("Jueves");
        semana.add("Viernes");
        semana.add("Sábado");
        semana.add("Domingo");


        //ArrayList <String> semana = new ArrayList<>(Arrays.asList("Lunes", "Martes","Miércoles", "Jueves", "Viernes", "Sábado","Domingo" ));

    }

    public ArrayList<String> getSemana() {
        return semana;
    }

    public void printDays() {
        System.out.println("Días de la semana:");
        for (String dia : semana) {
            System.out.println(dia);
        }
    }

    public void returnSize() {
        System.out.print(semana.size());
    }

    public void removeDay(String dia) {
        semana.remove(dia);
        System.out.println(semana);
    }

    //Este método está mal, solo funcionaría si quiero que me devuelva un índice dentro del array
    public void returnDayIndex(String dia) {
        //semana.get(dia); //get solo funciona con índices no con string
        System.out.println(semana);
    }

    public String returnDay(String dia) {
        for (String d : semana) {
            if (d.equals(dia)) {
                return d;
            }
        }
        return "dia no encontrado";
    }

    public void thereIs(String dia) {
        if (semana.contains(dia)) {
            System.out.print("Si está el día de la semana");
            
        }else{
            System.out.println("No existe ese día de la semana");
        }
    }

}
