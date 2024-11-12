package m4s11.patronescreacionales.patronfactory;

public class Debito implements IMetodoPago{
    @Override
    public String pago() {
        return "Se paga con Debito";
    }
}
