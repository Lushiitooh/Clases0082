package m4s14.ejemplos;

import java.sql.*;

public class EjemploSQLException {
    public static void main(String[] args) {
        try{
            Connection conexion = DriverManager
            .getConnection("jdbc:mysql://localhost:3306/prubasql","root","root");
            Statement declaracion = conexion.createStatement();
            ResultSet resultado = declaracion.executeQuery("SELECT * FROM estudiantes");
            System.out.println(resultado);
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
