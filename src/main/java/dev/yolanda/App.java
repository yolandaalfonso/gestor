package dev.yolanda;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {

        Gestor gestor = new Gestor();

        gestor.createList();
        gestor.printDays();
        gestor.returnSize();
        gestor.removeDay("Lunes");
        gestor.returnSize();
        gestor.returnDay("Jueves");
        gestor.thereIs("Miércoles");
    }
}
