/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoestructurasdatos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author enano
 */
public class LecturaEscrituraTxt {

    private String nombreArchivo;

    public LecturaEscrituraTxt(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public void escribirArchivo(String contenido) {
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(nombreArchivo, false))) { // true para agregar texto sin sobrescribir
            escritor.write(contenido);
            escritor.newLine();
            System.out.println("Escritura completada.");
            escritor.close();
        } catch (IOException e) {
            System.out.println("Ocurrió un error al escribir el archivo: " + e.getMessage());
        }

    }
    
        public void escribirArchivoAppend(String contenido) {
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(nombreArchivo, true))) { 
            escritor.write(contenido);
            escritor.newLine();
            System.out.println("Escritura completada.");
            escritor.close();
        } catch (IOException e) {
            System.out.println("Ocurrió un error al escribir el archivo: " + e.getMessage());
        }

    }

    public void leerArchivo() {
        try (BufferedReader lector = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            System.out.println("\nContenido del archivo:");
            while ((linea = lector.readLine()) != null) {
                System.out.println(linea);
            }
            lector.close();
        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el archivo: " + e.getMessage());
        }
    }
}
