package Entidades;

public class Planta {
    private String especie;
    private int posicionX;
    private int posicionY;
    private int salud;

    public Planta(String especie, int posicionX, int posicionY) {
        this.especie = especie;
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        this.salud = 100; // Inicializamos la salud en 100
    }

    public void crecer() {
        // Implementación de la lógica para crecer
    }

    public void polinizar() {
        // Implementación de la lógica para polinizar
    }

    // Otros métodos y getters/setters según sea necesario
}