package dev.yolanda;

import java.util.ArrayList;
import java.util.List;

public class Gestor {

    private List<String> semana;

    public Gestor() {
        createList();
    }
    
    public void createList() {
        semana = new ArrayList<>();
        semana.add("Lunes");
        semana.add("Martes");
        semana.add("Miércoles");
        semana.add("Jueves");
        semana.add("Viernes");
        semana.add("Sábado");
        semana.add("Domingo");

    }

    public List<String> getDias() {
        return semana;
    }

    public String printDays() {
        String result = "Días de la semana:\n";
        for (String dia : semana) {
            result += dia + "\n";
        }
        return result;
    }

    public int returnSize() {
        return semana.size();
    }

    public List<String> removeDay(String dia) {
        semana.remove(dia);
        return semana;
    }

    public String returnDay(String dia) {
        for (String d : semana) {
            if (d.equals(dia)) {
                return d;
            }
        }
        return "dia no encontrado";
    }

    public String thereIs(String dia) {
        if (semana.contains(dia)) {
            String mensaje = "Si está el día de la semana";
            return mensaje;
            
        }else{
            String mensaje = "No existe ese día de la semana";
            return mensaje;
        }
    }

    public List<String> sortList() {
        semana.sort(null);
        return semana;
    }

    public void clearDays(){
        semana.clear();
    }

}
