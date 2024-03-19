package Entidades;

public class Ambiente {
    private String clima;
    private String terreno;
    private int recursosDisponibles;
    private int posicionHierbaX;
    private int posicionHierbaY;

    public Ambiente(String clima, String terreno, int recursosDisponibles) {
        this.clima = clima;
        this.terreno = terreno;
        this.recursosDisponibles = recursosDisponibles;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public String getTerreno() {
        return terreno;
    }

    public void setTerreno(String terreno) {
        this.terreno = terreno;
    }

    public int getRecursosDisponibles() {
        return recursosDisponibles;
    }

    public void setRecursosDisponibles(int recursosDisponibles) {
        this.recursosDisponibles = recursosDisponibles;
    }

    public int getPosicionHierbaX() {
        return posicionHierbaX;
    }

    public void setPosicionHierbaX(int posicionHierbaX) {
        this.posicionHierbaX = posicionHierbaX;
    }

    public int getPosicionHierbaY() {
        return posicionHierbaY;
    }

    public void setPosicionHierbaY(int posicionHierbaY) {
        this.posicionHierbaY = posicionHierbaY;
    }
}