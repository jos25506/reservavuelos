package gestionreservavuelos;

public class GestionReservaVuelos {

    public static void main(String[] args) {


//Vuelo[] vuelos = new Vuelo[10];
//vuelos[0] = new Vuelo(1, "Madrid", "Nueva York", 2);
//vuelos[1] = new Vuelo(2, "Miami", "París", 50);
//vuelos[2] = new Vuelo(3, "Londres", "Tokio", 73);
//vuelos[3] = new Vuelo(4, "Los Ángeles", "Sídney", 19);
//vuelos[4] = new Vuelo(5, "Roma", "Dubái", 45);
//vuelos[5] = new Vuelo(6, "Barcelona", "Singapur", 88);
//vuelos[6] = new Vuelo(7, "Moscú", "Toronto", 12);
//vuelos[7] = new Vuelo(8, "Tokio", "Londres", 60);
//vuelos[8] = new Vuelo(9, "Sídney", "Roma", 33);
//vuelos[9] = new Vuelo(10, "Dubái", "Los Ángeles", 91);

       // Aerolinea aerolinea = new Aerolinea("Volaris", vuelo);

        //Pasajero pasajero = new Pasajero("Ana rodriguez", "12345678", "P987654");

      //  Reserva reserva = new Reserva("R01", pasajero, aerolinea.getVuelo());

        SistemaReservas sistema = new SistemaReservas();

      //  sistema.guardarReserva(reserva);
      
      gestionReserva gestion = new gestionReserva();
      gestion.setVisible(true);
      gestion.setLocationRelativeTo(null);
       // sistema.mostrarReserva();
        
//          menu m = new menu();
//        m.setVisible(true);
//        m.setLocationRelativeTo(null);

    }
}
