package dev.yolanda;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GestorTest {

    private Gestor gestor;

    @BeforeEach
    void setUp(){
        gestor = new Gestor();
    }

    @Test
    public void testCreateList() {
        gestor.createList();
        List<String> dias = gestor.getDias();
        List<String> expected = Arrays.asList("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"
        );
        assertEquals(expected, dias);
    }

    @Test
    void testPrintDays() {
        //Given
        String expected = 
        "Días de la semana:\n" +
        "Lunes\n" +
        "Martes\n" +
        "Miércoles\n" +
        "Jueves\n" +
        "Viernes\n" +
        "Sábado\n" +
        "Domingo\n";

        //When 
       String semana = gestor.printDays();

        //Then
        assertEquals(expected, semana);
        
    }

    @Test
    void testReturnSize() {
        //Given
        int expected = 7;

        //When 
       int size = gestor.returnSize();

        //Then
        assertEquals(expected, size);
        
    }


    @Test
    void testRemoveDay() {
        //Given
        List<String> expected = Arrays.asList(
            "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo" 
        );

        //When 
       List<String> semanaActual= gestor.removeDay("Lunes");

        //Then
        assertEquals(expected, semanaActual);
        assertFalse(semanaActual.contains("Lunes"));
        assertEquals(6, semanaActual.size());
    }

    @Test
    void testReturnDay() {
        //Given
        String expected = "Martes";

        //When 
       String buscado = gestor.returnDay("Martes");

        //Then
        assertEquals(expected, buscado);
    }

    @Test
    void testThereIs() {
        //Given
        String expected = "Si está el día de la semana";

        //When 
       String resultado = gestor.thereIs("Martes");

        //Then
        assertEquals(expected, resultado);
    }

    @Test
    public void testSortList() {
        //Given
        List<String> expected = Arrays.asList(
        "Domingo", "Jueves", "Lunes", "Martes", "Miércoles", "Sábado", "Viernes"
        );

        //When
        gestor.sortList();
        List <String> dias = gestor.getDias();
        //Then
        assertEquals(expected, dias);


    }

    @Test
    void testClearDays() {
        //Given
        

        //When 
       gestor.clearDays();

        //Then
        List<String> dias = gestor.getDias();
        assertTrue(dias.isEmpty());
        
    }

    
}
