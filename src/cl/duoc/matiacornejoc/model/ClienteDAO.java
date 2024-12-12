/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.matiacornejoc.model;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {

    public boolean agregarCliente(Cliente cliente) {
        String sql = "INSERT INTO clientes (rut, nombre_completo, telefono, correo) VALUES (?, ?, ?, ?)";
        try (Connection conn = new RentACar().getConexion();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, cliente.getID());
            ps.setString(2, cliente.getNombre_completo());
            ps.setString(3, cliente.getTelefono());
            ps.setString(4, cliente.getCorreo());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.err.println("Error al agregar cliente: " + e.getMessage());
            return false;
        }
    }

    public List<Cliente> listarClientes() {
        List<Cliente> lista = new ArrayList<>();
        String sql = "SELECT * FROM clientes";
        try (Connection conn = new RentACar().getConexion();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Cliente cliente = new Cliente(
                        rs.getInt("id"),
                        rs.getString("rut"),
                        rs.getString("nombre_completo"),
                        rs.getString("telefono"),
                        rs.getString("correo")
                );
                lista.add(cliente);
            }
        } catch (SQLException e) {
            System.err.println("Error al listar clientes: " + e.getMessage());
        }
        return lista;
    }

    public boolean editarCliente(Cliente cliente) {
        String sql = "UPDATE clientes SET nombre_completo = ?, telefono = ?, correo = ? WHERE rut = ?";
        try (Connection conn = new RentACar().getConexion();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, cliente.getNombre_completo());
            ps.setString(2, cliente.getTelefono());
            ps.setString(3, cliente.getCorreo());
            ps.setString(4, cliente.getID());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.err.println("Error al editar cliente: " + e.getMessage());
            return false;
        }
    }

    public boolean eliminarCliente(String rut) {
        String sql = "DELETE FROM clientes WHERE rut = ?";
        try (Connection conn = new RentACar().getConexion();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, rut);
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.err.println("Error al eliminar cliente: " + e.getMessage());
            return false;
        }
    }
}