package m4s11.patronescreacionales.patronsingleton;
/*
Estos patrones se centran en la creacion de objetos de manera controlada y fexlible,
encapsulando el proceso de creacion.

Singleton: se encarga de asegurar que una clase tenga una unica instancia y proporciona
acceso global a ella.
 */
public class Singleton {
    //variable estatica y de caracter privada, la cual va a almacenar la instancia de la clase
    private static Singleton instancia;

    //Contructor vacio: evita que se instancie fuera de la clase actual (private).
    private Singleton() {
    }
    //Metodo Get estatico, devuelve una unica instancia, creando una nueva si esta no existe.
    public static Singleton getInstancia() {
        if (instancia == null) {
            instancia = new Singleton();
            System.out.println("instancia creada");
        } else{
            System.out.println("Llamada al singleton existente");
        }
        return instancia;

    }

}
