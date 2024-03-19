package Entidades;

public class Animal {
    private String especie;
    private int posicionX;
    private int posicionY;
    private int salud;
    private int edad;
    private boolean estadoReproductivo;

    public Animal(String especie, int posicionX, int posicionY, boolean b) {
        this.especie = especie;
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        this.salud = 100; // Inicializamos la salud en 100
        this.edad = 0; // Inicializamos la edad en 0
        this.estadoReproductivo = false; // Inicialmente no está en estado reproductivo
    }

    public void mover(int nuevaPosX, int nuevaPosY) {
        // Implementación de la lógica para el movimiento del animal
        this.posicionX = nuevaPosX;
        this.posicionY = nuevaPosY;
    }

    public void comer() {
        // Implementación de la lógica para la alimentación del animal
        this.salud += 10; // Incremento arbitrario en la salud después de comer
    }

    public void depredar(Animal presa) {
        // Simulación de la predación
        int daño = 20; // Daño causado por el depredador
        presa.salud -= daño;
        if (presa.salud <= 0) {
            // Si la salud de la presa llega a 0, muere
            System.out.println("¡El " + this.especie + " ha cazado y devorado a la " + presa.getEspecie() + "!");
        } else {
            System.out.println("El " + this.especie + " está cazando a la " + presa.getEspecie() + ".");
        }
    }

    private String getEspecie() {
        return this.especie;
    }

    // Otros métodos y getters/setters según sea necesario
}