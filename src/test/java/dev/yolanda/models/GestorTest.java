package dev.yolanda.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

public class GestorTest {
    @Test
    void testCreateList() {
         //Given
         List<String> expected = Arrays.asList("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo");
         Gestor gestor = new Gestor();

         //When 
        //List<String> dias = gestor.createList();

         //Then
         assertEquals(expected, dias);
    }
}
