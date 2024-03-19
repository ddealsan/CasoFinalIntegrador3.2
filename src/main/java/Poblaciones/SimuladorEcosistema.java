package Poblaciones;

import Entidades.Ambiente;
import Entidades.Animal;
import Entidades.Planta;

import java.util.Random;

public class SimuladorEcosistema {
    private Animal leon;
    private Animal zebra;
    private Planta hierba;
    private Planta arbusto;
    private Ambiente ambiente;

    public SimuladorEcosistema(Animal leon, Animal zebra, Planta hierba, Planta arbusto, Ambiente ambiente) {
        this.leon = leon;
        this.zebra = zebra;
        this.hierba = hierba;
        this.arbusto = arbusto;
        this.ambiente = ambiente;
    }

    public void simularEcosistema() {
        System.out.println("Estado del ecosistema:");
        System.out.println("Ambiente: " + ambiente.getClima() + ", " + ambiente.getTerreno() + ", Recursos disponibles: " + ambiente.getRecursosDisponibles());

        System.out.println("Animales:");
        System.out.println("León - Posición: (" + leon.getPosicionX() + ", " + leon.getPosicionY() + "), Salud: " + leon.getSalud() + ", Edad: " + leon.getEdad() + ", Estado reproductivo: " + leon.isEstadoReproductivo());
        System.out.println("Zebra - Posición: (" + zebra.getPosicionX() + ", " + zebra.getPosicionY() + "), Salud: " + zebra.getSalud() + ", Edad: " + zebra.getEdad() + ", Estado reproductivo: " + zebra.isEstadoReproductivo());

        System.out.println("Plantas:");
        System.out.println("Hierba - Posición: (" + hierba.getPosicionX() + ", " + hierba.getPosicionY() + "), Salud: " + hierba.getSalud() + ", Edad: " + hierba.getEdad() + ", Estado reproductivo: " + hierba.isEstadoReproductivo());
        System.out.println("Arbusto - Posición: (" + arbusto.getPosicionX() + ", " + arbusto.getPosicionY() + "), Salud: " + arbusto.getSalud() + ", Edad: " + arbusto.getEdad() + ", Estado reproductivo: " + arbusto.isEstadoReproductivo());

        // Simular interacciones naturales
        simularInteraccionesNaturales();

        // Simular crecimiento y reproducción
        simularCrecimientoYReproduccion();

        // Simular eventos aleatorios
        simularEventosAleatorios();
    }

    private void simularInteraccionesNaturales() {
        // Implementar lógica para simular interacciones naturales entre especies (predación, competencia, polinización, etc.)
        Random random = new Random();


        // Simular predación (ejemplo)
        if (random.nextDouble() < 0.9) { // Probabilidad del 50%
            if (distanciaEntreAnimales(leon, zebra) < 3) {
                leon.depredar(zebra);
            }
        }

        // Simular consumo de hierba por parte de la Zebra
        if (distanciaEntreAnimalYPlanta(zebra, hierba) <= 1) {
            zebra.comer();
            hierba.serComida();
        }

    }
    private double distanciaEntreAnimalYPlanta(Animal animal, Planta planta) {
        int distanciaX = Math.abs(animal.getPosicionX() - planta.getPosicionX());
        int distanciaY = Math.abs(animal.getPosicionY() - planta.getPosicionY());
        return Math.sqrt(distanciaX * distanciaX + distanciaY * distanciaY);
    }
    private double distanciaEntreAnimales(Animal animal1, Animal animal2) {
        int deltaX = animal1.getPosicionX() - animal2.getPosicionX();
        int deltaY = animal1.getPosicionY() - animal2.getPosicionY();
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    private void simularCrecimientoYReproduccion() {
        // Implementar algoritmos para el crecimiento de la población y la reproducción de las especies
        // Por simplicidad, se puede suponer un crecimiento y reproducción básicos
        leon.incrementarEdad();
        zebra.incrementarEdad();
        hierba.incrementarEdad();
        arbusto.incrementarEdad();

        if (leon.getEdad() >= 3 && leon.getSalud() >= 50) {
            leon.setEstadoReproductivo(true);
        }

        if (zebra.getEdad() >= 2 && zebra.getSalud() >= 40) {
            zebra.setEstadoReproductivo(true);
        }

        if (hierba.getEdad() >= 1) {
            hierba.setEstadoReproductivo(true);
        }

        if (arbusto.getEdad() >= 2) {
            arbusto.setEstadoReproductivo(true);
        }
    }

    private void simularEventosAleatorios() {
        // Implementar eventos aleatorios que afecten a las poblaciones, como desastres naturales, enfermedades, etc.
        Random random = new Random();
        // Ejemplo de evento aleatorio de enfermedad (probabilidad del 10%)
        if (random.nextDouble() < 0.1) {
            // Lógica para simular la enfermedad
            leon.setSalud(leon.getSalud() - 20); // Reducir la salud del león debido a la enfermedad
            if (leon.getSalud() <= 0) {
                System.out.println("¡El león ha muerto debido a una enfermedad!");
            }
        }
        // Otros eventos aleatorios como desastres naturales, cambios climáticos, etc.
    }
}