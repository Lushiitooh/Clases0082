package m4s11.patronescreacionales.patronfactory;

/*
Factory: permite que una superclase pueda definir un metodo para crear objetos
pero permite a las subclases modificar el tipo de objeto que se crea.
 */

public class Main {
    public static void main(String[] args) {

        IMetodoPago metodoPago = MetodoPagoFactory.getFormaPago("Credito");
        System.out.println(metodoPago.pago());
    }
}
