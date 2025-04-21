package gestionreservavuelos;

import java.util.Random;

public class Vuelo {

    private int numero;
    private String origen;
    private String destino;
    private int asientos;
    
   

    public Vuelo(int numeroVuelo, String origen, String destino, int asientos) {
        this.numero = numeroVuelo;
        this.origen = origen;
        this.destino = destino;
        this.asientos = asientos;
    }
    public Vuelo( String origen, String destino, int asientos){
        this.origen = origen;
        this.destino = destino;
        this.asientos = asientos;   
    }
    
    
    public Vuelo() {
        this.numero = 0;
        this.origen = "";
        this.destino = "";
        this.asientos = 0;
    }
       public Vuelo(int numero) {
        this.numero = numero;
       
       }

    public int getNumero() {
        return numero;
    }
   
    public void setNumero(int numero) {
    this.numero = numero;
}

    public boolean hayAsientos(int cantidad) {
        if (cantidad <= asientos) {
            asientos = asientos - cantidad;
            return true;
        } else {
            return false;
        }
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getAsientos() {
        return asientos;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }
    public boolean reservarAsientos(int cantidad) throws VueloNoDisponibleException {
        // Si no hay suficientes asientos disponibles, lanzamos la excepción
        if (cantidad > asientos) {
            throw new VueloNoDisponibleException("No hay suficientes asientos disponibles en el vuelo " + numero);
        } else {
            asientos -= cantidad;
            return true; // Reserva exitosa
        }
    }
    
//      public void crearVuelo(){
//        Random random = new Random();
//        int v = random.nextInt(1,5);
//       // String origen = 
//        int a = random.nextInt(1,100);
//        Vuelo vuelo = new Vuelo(v, "Madrid", "Nueva York", a);
//      
//    }
}
