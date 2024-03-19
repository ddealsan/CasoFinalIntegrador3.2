package Entidades;

public class Planta {
    private String especie;
    private int posicionX;
    private int posicionY;
    private int salud;
    private int edad;
    private boolean estadoReproductivo;

    public Planta(String especie, int posicionX, int posicionY) {
        this.especie = especie;
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        this.salud = 100; // Inicializamos la salud en 100
        this.edad = 0; // Inicializamos la edad en 0
        this.estadoReproductivo = false; // Inicialmente no está en estado reproductivo
    }

    public void crecer() {
        // Implementación de la lógica para el crecimiento de la planta
        this.edad++;
        this.salud += 5; // Incremento arbitrario en la salud
    }

    public void polinizar() {
        // Implementación de la lógica para la polinización
        this.estadoReproductivo = true;
    }

    // Otros métodos y getters/setters según sea necesario
}