package m4s10.ejercicioDificil;

//Crea un sistema de notificaciones donde puedes notificar por Email o SMS.

// Crea una interfaz INotificador con un metodo enviarNotificacion().

// Las clases EmailNotificador y SMSNotificador implementarán la interfaz,
// cada una enviando su notificación específica.
// La clase Alerta utilizará Notificador para enviar mensajes.

// Aplica DIP permitiendo que Alerta dependa de la interfaz,
// no de implementaciones específicas.


public class Main{
    public static void main(String[] args) {
        //Modo Basico de inicializar un objeto y luego llamar al metodo que esta sobrescrito
        /*
        EmailNotificador notificador = new EmailNotificador();
        notificador.enviarNotificacion("String Mensaje");

        SMSNotificador sms = new SMSNotificador();
        sms.enviarNotificacion("Alerta SMS");
        */

        /////////////////////////////////////////////////////////////////

        //Crea una nueva instancia de EmailNotificador que es una implementacion de INotificador
        INotificador emailNotificador = new EmailNotificador();
        //crea una instanacia de Alerta pasandole el parametro EmailNotificador
        //permitiendo que Alerta pueda usar Notificacion de la clase Email
        Alerta alertaEmail = new Alerta(emailNotificador);
        //Enviando mensaje de alerta que usa el metodo enviarNotificacionDeAlerta de EmailNotificador
        alertaEmail.enviarNotificionDeAlerta("Alerta de prueba para EMAIL");

        ////////////////////////////////////////////////////////////////////////

        INotificador smsNotificador = new SMSNotificador();

        Alerta smsAlerta = new Alerta(smsNotificador);

        smsAlerta.enviarNotificionDeAlerta("Alerta de prueba para SMS");


    }
}



//Metodos de pago (pagar, recibir dinero, transferencias, pagos recurrentes, debit, credito).

//interfaz: Pagar
//intefaz: recibir dinero
//tranferencias
//pagos recurrentes
//credito
//debito

//usuario:pagar dinero -> metodo de pago implementa interfaz pagar

//Ayudante: metodoPagar(); -> interfaz de pagar() a interfaz de debito();

//Metodo de pago -> Intermediario
