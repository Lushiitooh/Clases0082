import java.sql.*;

public class SqlConection {
        public static void main(String[] args) {
            //rollback
            try{
                Connection conexion = DriverManager
                        .getConnection("jdbc:mysql://localhost:3306/prubasql","root","root");
                Statement declaracion = conexion.createStatement();
                ResultSet resultado = declaracion.executeQuery("SELECT * FROM cursos_estudiantes");

                while(resultado.next()){
                    int id = resultado.getInt("id_cursos_estudiantes");
                    int id_estudiante = resultado.getInt("id_estudiante");
                    int id_curso = resultado.getInt("id_curso");

                    System.out.println("id curso estudiante: " + id + " id_estudiante: " + id_estudiante + "id_curso" + id_curso);

                }
            }catch(SQLException e){
                System.out.println(e.getMessage());
            }
        }
    }

