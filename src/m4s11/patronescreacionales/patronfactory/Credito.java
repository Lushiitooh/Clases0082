package m4s11.patronescreacionales.patronfactory;

public class Credito implements IMetodoPago {
    @Override
    public String pago() {
        return "Pago con credito";
    }
}
