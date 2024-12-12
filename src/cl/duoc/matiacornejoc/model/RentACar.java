package cl.duoc.matiacornejoc.model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RentACar {
    private final String base = "rentacar";
    private final String user = "RentACar";
    private final String password = "RentACar";
    private final String url = "jdbc:mysql://localhost:3306/" + base;
    private Connection con = null;

    public Connection getConexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(this.url, this.user, this.password);
        } catch (SQLException e) {
            System.err.println(e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RentACar.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
}
