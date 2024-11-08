package m4s14.ejemplos;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class EjemploSocketException {
    //IOException o SocketExcepcion son operaciones de red (Host, servidor, base de datos)
    public static void main(String[] args) {
        try{
            Socket socket = new Socket("192.168.1.50", 80);
            System.out.println(socket);
        }catch(UnknownHostException e){
          System.out.println("No se pudo resolver la direccion del host "+e.getMessage());
        }
        catch(IOException e){
            System.out.println(" No se pudo establecer la conexion "+e.getMessage());
        }
    }
}
