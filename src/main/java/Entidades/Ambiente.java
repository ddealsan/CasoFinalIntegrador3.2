package Entidades;

public class Ambiente {
    private String clima;
    private String terreno;
    private int recursosDisponibles;

    public Ambiente(String clima, String terreno, String recursosDisponibles) {
        this.clima = clima;
        this.terreno = terreno;
        this.recursosDisponibles = recursosDisponibles;
    }

    public void cambiarClima(String nuevoClima) {
        this.clima = nuevoClima;
    }

    public void cambiarRecursosDisponibles(int nuevosRecursos) {
        this.recursosDisponibles = nuevosRecursos;
    }

    // Otros métodos y getters/setters según sea necesario
}