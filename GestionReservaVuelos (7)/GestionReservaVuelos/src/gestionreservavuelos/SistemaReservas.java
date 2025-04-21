
package gestionreservavuelos;

import java.util.ArrayList;
import java.util.List;



public class SistemaReservas {
    private Reservas reserva1;
 private List<Vuelo> vuelos; 
    public SistemaReservas() {
        this.reserva1 = null; 
         this.vuelos = new ArrayList<>();
    }
    
     public void realizarReserva(int vueloNumero, int cantidadAsientos) {
        try {
            // Buscar el vuelo con el número especificado
            Vuelo vuelo = null;
            for (Vuelo v : vuelos) {
                if (v.getNumero() == vueloNumero) {
                    vuelo = v;
                    break;
                }
            }

            // Si no se encuentra el vuelo, lanzamos una excepción personalizada
            if (vuelo == null) {
                throw new VueloNoDisponibleException("Vuelo no encontrado con el número " + vueloNumero);
            }

            // Intentar reservar asientos en el vuelo
            boolean reservaExitosa = vuelo.reservarAsientos(cantidadAsientos);
            if (reservaExitosa) {
                System.out.println("Reserva exitosa en el vuelo " + vueloNumero);
            }

        } catch (VueloNoDisponibleException e) {
            // Atrapar y manejar la excepción personalizada
            System.err.println("Error: " + e.getMessage());
        }
    }

//    public void guardarReserva(Reservas reserva) {
//        if (reserva1 == null) {
//            reserva1 = reserva;
//            reserva.hacerReserva();
//        } else {
//            System.out.println("Ya hay una reserva en el sistema.");
//        }
//    }

//    public void mostrarReserva() {
//        if (reserva1 != null) {
//            System.out.println("reserva guardada: " + reserva1.getCodigo());
//        } else {
//            System.out.println("no hay reservas.");
//        }
//    }
}