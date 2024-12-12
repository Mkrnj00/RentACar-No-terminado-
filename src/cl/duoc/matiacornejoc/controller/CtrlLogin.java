package cl.duoc.matiacornejoc.controller;
import cl.duoc.matiacornejoc.view.frmMenu;
import cl.duoc.matiacornejoc.model.RentACar;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*;
import java.sql.Connection;

public class CtrlLogin{

    public boolean validarCredenciales(String usuario, String contrasena) {
    String sql = "SELECT * FROM usuarios WHERE username = ? AND password = ?";
    try (Connection conn = new RentACar().getConexion();
         PreparedStatement ps = conn.prepareStatement(sql)) {
        ps.setString(1, usuario);
        ps.setString(2, contrasena);

        try (ResultSet rs = ps.executeQuery()) {
            return rs.next();
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error en la conexión: " + e.getMessage(),
                "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
        return false;
    }
}

}