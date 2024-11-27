package main.java.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {
    private static Connection conexion = null;

    private conexion() {        
    }

    public static Connection conexion() {
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/prueba1"; // ubicación, escucha, base de datos
        String user = "root";
        String password = "root";
        try {
            if (conexion == null || conexion.isClosed()) {
                Class.forName(driver);
                conexion = DriverManager.getConnection(url, user, password);
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return conexion;
    }

    public static void closeConexion() {
        try {
            if (conexion != null && !conexion.isClosed()) {
                conexion.close();
                conexion = null; // Reset the connection to null
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

