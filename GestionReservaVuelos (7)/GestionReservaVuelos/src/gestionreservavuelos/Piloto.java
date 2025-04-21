
package gestionreservavuelos;



public class Piloto extends Persona {
    private String licencia;

    public Piloto(String nombre, int identificacion, String licencia) {
        super(nombre, identificacion);
        this.licencia = licencia;
    }

  
    public void registrar() {
        System.out.println("Piloto " + getNombre() + " registrado con licencia " + licencia);
    }

   
    public String mostrarDatos() {
        return "Piloto: " + getNombre() + ", licencia: " + licencia;
    }
}