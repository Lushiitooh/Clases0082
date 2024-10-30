package m4s10.ejercicioDificil;

//Clase que implementa el INotificador sobreescribiendo metodo para enviar mensaje
public class EmailNotificador implements INotificador{

    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println("Enviando un Email: "+ mensaje);
    }


}
