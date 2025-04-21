package gestionreservavuelos;


public class Aerolinea {
    private String nombre;
    private Vuelo vuelo; 

    public Aerolinea(String nombre, Vuelo vuelo) {
        this.nombre = nombre;
        this.vuelo = vuelo;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }
}
