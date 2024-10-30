package m4s10.ejercicioDificil;

//Clase que utilizara INotificador para enviar alertas pero no la va a implementar
public class Alerta{
    //Atributo de tipo INotificador(es una referencia a la interfaz de INotificador)
    private INotificador notificadorEspecial;

    //Constructor de la clase Alerta que recibe un objeto de tipo INotificador
    //Este objeto que estamos inicializando puede ser cualquier clase que implemente a INotificador
    public Alerta(INotificador notificadorEspecial){
        //Se guarda la instancia de INotificador en el campo llamado notificadorEspecial
        this.notificadorEspecial = notificadorEspecial;
    }

    //metodo que envia una alerta utilizando el objerto INotificador que se encuentra
    // inyectado en el constructor
    public void enviarNotificionDeAlerta(String mensaje){
        notificadorEspecial.enviarNotificacion(mensaje);
    }

}
