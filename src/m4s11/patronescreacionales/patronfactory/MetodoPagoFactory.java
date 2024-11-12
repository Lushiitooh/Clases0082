package m4s11.patronescreacionales.patronfactory;

public class MetodoPagoFactory {
    public static IMetodoPago getFormaPago(String metodoPago){
        switch(metodoPago){
            case "Debito":
                return new Debito();
            case "Credito":
                return new Credito();
            case "Efectivo":
                return new Efectivo();
            default:
                throw new IllegalArgumentException("tipo de pago desconocido");
        }
    }
}
