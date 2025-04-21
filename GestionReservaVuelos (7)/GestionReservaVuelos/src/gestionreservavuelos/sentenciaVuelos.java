/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionreservavuelos;

import java.sql.*;

/**
 *
 *
 * @author chelo
 */
public class sentenciaVuelos extends conexion {

    public boolean insertar(Vuelo pro) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "INSERT INTO vuelos(origen, destino, asientos) VALUES (?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            //ps.setInt(1, pro.getNumero());
            ps.setString(1, pro.getOrigen());
            ps.setString(2, pro.getDestino());
            ps.setInt(3, pro.getAsientos());
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

    public boolean eliminar(Vuelo pro) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "DELETE FROM vuelos WHERE numero=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, pro.getNumero());
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

    public boolean buscar(Vuelo pro) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        // cualquier numero que ingrese devuelve los datos 
        //cuando se usa origen
        // cuando se usa numero no devuvle nada 
        String sql = "SELECT * FROM vuelos WHERE numero=?";
        try {
            System.out.println("Buscando vuelo con numero: " + pro.getNumero());
            ps = con.prepareStatement(sql);
            ps.setInt(1, pro.getNumero());
            rs = ps.executeQuery();

            if (rs.next()) {
                pro.setNumero(Integer.parseInt(rs.getString("numero")));
                pro.setOrigen(rs.getString("origen"));
                pro.setDestino(rs.getString("destino"));
                pro.setAsientos(Integer.parseInt(rs.getString("asientos")));

                return true;

            }
            return false;
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

    public int AsientosDisponibles(Vuelo pro) { 
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "SELECT asientos FROM vuelos WHERE numero = ?";

        try {
            System.out.println("Buscando vuelo con numero: " + pro.getNumero());
            ps = con.prepareStatement(sql);
            ps.setInt(1, pro.getNumero());
            rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt("asientos"); 
            }
            return -1; 
        } catch (SQLException e) {
            System.err.println(e);
            return -1; 
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

}
