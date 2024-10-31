package m4s11.patronescreacionales.patronfactory;

public class Efectivo implements IMetodoPago {

    @Override
    public String pago() {
        return "pago con efectivo";
    }
}
