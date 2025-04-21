/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionreservavuelos;

import java.sql.*;

/**
 *
 * @author chelo
 */
public class sentenciaPasajero extends conexcionP {

    sentenciaVuelos cantidadV = new sentenciaVuelos();

    public boolean insertarPasajero(Pasajero p ) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "INSERT INTO pasajeros(nombre, identificacion, pasaporte) VALUES (?,?,?)";
        try {
            ps = con.prepareStatement(sql);

            ps.setString(1, p.getNombre());
            ps.setInt(2, p.getIdentificacion());
            ps.setInt(3, p.getPasaporte());

            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
                return false;
            }
        }

    }

}
