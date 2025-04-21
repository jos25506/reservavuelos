
package gestionreservavuelos;



public class Pasajero extends Persona {
    private int pasaporte;

    public Pasajero(String nombre, int identificacion, int pasaporte) {
        super(nombre, identificacion);
        this.pasaporte = pasaporte;
    }

    @Override
    public void registrar() {
        System.out.println("el pasajero " + getNombre() + "  registrado con pasaporte " + pasaporte);
    }

    @Override
    public String mostrarDatos() {
        return "el pasajero de nombre:  " + getNombre() + " Pasaporte:"+pasaporte;
    }

    public int getPasaporte() {
        return pasaporte;
    }

    public void setPasaporte(int pasaporte) {
        this.pasaporte = pasaporte;
    }
      
}