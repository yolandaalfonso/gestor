package dev.yolanda;

import dev.yolanda.models.Gestor;

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

        gestor.crearLista();
        gestor.imprimirDias();
    }
}
