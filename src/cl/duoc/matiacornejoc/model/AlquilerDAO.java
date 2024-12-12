/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.matiacornejoc.model;


import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AlquilerDAO {

    public boolean registrarAlquiler(Alquiler alquiler) {
        String sql = "INSERT INTO alquileres (fecha_alquiler, cliente_id, id_vehiculo, duracion_dias, costo_total) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = new RentACar().getConexion();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setTimestamp(1, new Timestamp(alquiler.getFecha().getTime()));
            ps.setString(2, alquiler.getID_cliente());
            ps.setString(3, alquiler.getPatente_vehiculo());
            ps.setInt(4, alquiler.getDuracion_Alquiler());
            ps.setDouble(5, alquiler.getCosto_total());
            ps.executeUpdate();

            String updateVehiculo = "UPDATE vehiculos SET estado = 'alquilado' WHERE patente = ?";
            try (PreparedStatement psVehiculo = conn.prepareStatement(updateVehiculo)) {
                psVehiculo.setString(1, alquiler.getPatente_vehiculo());
                psVehiculo.executeUpdate();
            }

            return true;

        } catch (SQLException e) {
            Logger.getLogger(AlquilerDAO.class.getName()).log(Level.SEVERE, "Error al registrar alquiler", e);
            return false;
        }
    }
}
