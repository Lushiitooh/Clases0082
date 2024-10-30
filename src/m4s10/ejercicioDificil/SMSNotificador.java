package m4s10.ejercicioDificil;

//Clase que implementa el INotificador sobreescribiendo metodo para enviar mensaje
public class SMSNotificador implements INotificador{

    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println("Enviando un SMS " + mensaje);
    }
}
