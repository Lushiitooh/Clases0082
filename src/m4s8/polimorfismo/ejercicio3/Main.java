package m4s8.polimorfismo.ejercicio3;

/*
Tu tarea es crear un programa en Java que permita gestionar estos eventos de la siguiente manera:

Interfaz Evento: Define los métodos comunes mostrarDetalles() y calcularAsistentes().

Clase base abstracta EventoBase: Implementa la interfaz Evento y define los atributos comunes:
nombreEvento (nombre del evento)
lugar (ubicación del evento)
fecha (fecha del evento)
precioEntrada (precio de la entrada)

Clases hijas concretas:
Concierto: Además de los atributos comunes, tiene un atributo bandaPrincipal.
Conferencia: Tiene un atributo ponentePrincipal y un tema.
ExposicionArte: Tiene un atributo artistaPrincipal y númeroDeObras.

Ingreso de datos por parte del usuario: El programa debe solicitar al usuario que ingrese la información
para crear cada tipo de evento.
Luego, debe calcular la cantidad de asistentes potenciales en función de un
cálculo simple: (precio de entrada) / (constante de 10) para simular el impacto del precio en la asistencia esperada.

Mostrar detalles de cada evento: El programa debe mostrar los detalles completos de cada evento ingresado,
incluyendo el tipo de evento.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Concierto
        System.out.println("Ingrese nombre del Evento: ");
        String nombreEventoUsuario = sc.nextLine();
        System.out.println("Ingrese lugar del evento: ");
        String lugarUsuario = sc.nextLine();
        System.out.println("Ingrese fecha del evento (DD-MM-YYYY): ");
        String fechaUsuario = sc.nextLine();
        System.out.println("Ingrese precio de las entradas C/U: ");
        int precioEntradasUsuario = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese nombre de la banda principal: ");
        String bandaPrincipalUsuario = sc.nextLine();
        System.out.println("Ingrese la cantidad de asistencia a este evento: ");
        int asistenciaUsuario = sc.nextInt();
        sc.nextLine();


        EventoBase evento1 = new Concierto(nombreEventoUsuario, lugarUsuario, fechaUsuario, precioEntradasUsuario, asistenciaUsuario, bandaPrincipalUsuario);
        evento1.mostrarDetalles();


        //Conferencia
        System.out.println("Ingrese nombre del Evento: ");
        String nombreEventoUsuario2 = sc.nextLine();
        System.out.println("Ingrese lugar del evento: ");
        String lugarUsuario2 = sc.nextLine();
        System.out.println("Ingrese fecha del evento (DD-MM-YYYY): ");
        String fechaUsuario2 = sc.nextLine();
        System.out.println("Ingrese precio de las entradas C/U: ");
        int precioEntradasUsuario2 = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese nombre de la conferencia: ");
        String nombreConferenciaUsuario2 = sc.nextLine();
        System.out.println("Tema de conversacion: ");
        String temaConversacionUsuario2 = sc.nextLine();
        System.out.println("Ingrese la cantidad de asistencia a este evento: ");
        int asistenciaUsuario2 = sc.nextInt();
        sc.nextLine();

        EventoBase conferencia = new Conferencia(nombreEventoUsuario2,lugarUsuario2, fechaUsuario2,precioEntradasUsuario2,asistenciaUsuario2,nombreConferenciaUsuario2,temaConversacionUsuario2);
        conferencia.mostrarDetalles();

        //Exposicion de arte
        System.out.println("Ingrese nombre del Evento: ");
        String nombreEventoUsuario3 = sc.nextLine();
        System.out.println("Ingrese lugar del evento: ");
        String lugarUsuario3 = sc.nextLine();
        System.out.println("Ingrese fecha del evento (DD-MM-YYYY): ");
        String fechaUsuario3 = sc.nextLine();
        System.out.println("Ingrese precio de las entradas C/U: ");
        int precioEntradasUsuario3 = sc.nextInt();
        sc.nextLine();
        System.out.println("Nombre Artista Principal: ");
        String artistaPrincipalUsuario3 = sc.nextLine();
        System.out.println("Numero de obras a presentar: ");
        int numeroObrasUsuario3 = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese la cantidad de asistencia a este evento: ");
        int asistenciaUsuario3 = sc.nextInt();
        sc.nextLine();

        EventoBase exposicion = new ExposicionArte(nombreEventoUsuario3, lugarUsuario3, fechaUsuario3, precioEntradasUsuario3,asistenciaUsuario3,artistaPrincipalUsuario3,numeroObrasUsuario3);
        exposicion.mostrarDetalles();

    }

}
