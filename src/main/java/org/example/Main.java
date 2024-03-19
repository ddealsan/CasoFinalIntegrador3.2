package org.example;

import Entidades.Animal;
import Entidades.Planta;
import Entidades.Ambiente;
import Poblaciones.SimuladorEcosistema;
import gestion.InterfazUsuario;
import gestion.Autenticacion;
import gestion.RegistroActividades;
import analisis_avanzado.ResolucionProblemas;
import analisis_avanzado.VisualizacionDatos;
import analisis_avanzado.IntegracionNuevasFunciones;
public class Main {
    public static void main(String[] args) {
        // Crear instancias de plantas y animales
        Animal leon = new Animal("León", 1, 100, true);
        Animal zebra = new Animal("Zebra", 2, 80, true);
        Planta hierba = new Planta("Hierba", 1, 50, true);
        Planta arbusto = new Planta("Arbusto", 2, 70, true);
}