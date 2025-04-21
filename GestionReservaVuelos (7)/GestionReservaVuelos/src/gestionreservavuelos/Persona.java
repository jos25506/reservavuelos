
package gestionreservavuelos;

public abstract class Persona {
    private String nombre;
    private int identificacion;

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public Persona(String nombre, int identificacion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
    }

   
    public abstract void registrar();
    public abstract String mostrarDatos();

  
    public String getNombre() {
        return nombre;
    }
}