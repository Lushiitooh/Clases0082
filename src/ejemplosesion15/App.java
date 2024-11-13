package ejemplosesion15;
import ejemplosesion15.src.main.java.org.example.service.Service;

import static ejemplosesion15.src.main.java.org.example.service.Service.obtenerTodosLosUsuarios;


public class App {
    public static void main(String[] args) {
         Service service = new Service();
        //obtenerPostbyId(4);
        //comentariosPorId(1);
        obtenerTodosLosUsuarios();
    }
}

