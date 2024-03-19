package Entidades;

public class Animal {
    private String especie;
    private int posicionX;
    private int posicionY;
    private int salud;
    private int edad;
    private boolean estadoReproductivo;

    public Animal(String especie, int posicionX, int posicionY, boolean estadoReproductivo) {
        this.especie = especie;
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        this.salud = 100; // Inicializamos la salud en 100
        this.edad = 0; // Inicializamos la edad en 0
        this.estadoReproductivo = estadoReproductivo; // Estado reproductivo inicial
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getPosicionX() {
        return posicionX;
    }

    public void setPosicionX(int posicionX) {
        this.posicionX = posicionX;
    }

    public int getPosicionY() {
        return posicionY;
    }

    public void setPosicionY(int posicionY) {
        this.posicionY = posicionY;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isEstadoReproductivo() {
        return estadoReproductivo;
    }

    public void setEstadoReproductivo(boolean estadoReproductivo) {
        this.estadoReproductivo = estadoReproductivo;
    }
    public void incrementarEdad() {
        this.edad++;
    }
    public void depredar(Animal presa) {
        // Simulación de la depredación
        int danio = 20; // Daño causado por el depredador
        presa.salud -= danio;
        if (presa.salud <= 0) {
            System.out.println("El " + this.especie + " ha cazado y devorado a la " + presa.getEspecie() + "!");
        } else {
            System.out.println("El " + this.especie + " está cazando a la " + presa.getEspecie() + ".");
        }
    }
}