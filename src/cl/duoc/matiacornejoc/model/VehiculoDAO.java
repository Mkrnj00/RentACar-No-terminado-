/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.matiacornejoc.model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class VehiculoDAO {

    public boolean agregarVehiculo(Vehiculo vehiculo) {
        String sql = "INSERT INTO vehiculos (patente, marca, modelo, año, tipo, estado) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = new RentACar().getConexion();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, vehiculo.getPatente());
            ps.setString(2, vehiculo.getMarca());
            ps.setString(3, vehiculo.getModelo());
            ps.setInt(4, vehiculo.getAño());
            ps.setString(5, vehiculo.getTipo());
            ps.setBoolean(6, vehiculo.getEstado());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.err.println("Error al agregar vehículo: " + e.getMessage());
            return false;
        }
    }

    public List<Vehiculo> listarVehiculos() {
        List<Vehiculo> lista = new ArrayList<>();
        String sql = "SELECT * FROM vehiculos";
        try (Connection conn = new RentACar().getConexion();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Vehiculo vehiculo = new Vehiculo(
                        rs.getString("patente"),
                        rs.getString("marca"),
                        rs.getString("modelo"),
                        rs.getInt("año"),
                        rs.getString("tipo"),
                        rs.getBoolean("estado")
                );
                lista.add(vehiculo);
            }
        } catch (SQLException e) {
            System.err.println("Error al listar vehículos: " + e.getMessage());
        }
        return lista;
    }

    public boolean editarVehiculo(Vehiculo vehiculo) {
        String sql = "UPDATE vehiculos SET marca = ?, modelo = ?, año = ?, tipo = ?, estado = ? WHERE patente = ?";
        try (Connection conn = new RentACar().getConexion();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, vehiculo.getMarca());
            ps.setString(2, vehiculo.getModelo());
            ps.setInt(3, vehiculo.getAño());
            ps.setString(4, vehiculo.getTipo());
            ps.setBoolean(5, vehiculo.getEstado());
            ps.setString(6, vehiculo.getPatente());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.err.println("Error al editar vehículo: " + e.getMessage());
            return false;
        }
    }

    public boolean eliminarVehiculo(String patente) {
        String sql = "DELETE FROM vehiculos WHERE patente = ?";
        try (Connection conn = new RentACar().getConexion();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, patente);
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.err.println("Error al eliminar vehículo: " + e.getMessage());
            return false;
        }
    }
}