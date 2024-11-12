package m4s11.patronesestructurales.bridge;

public class Televisor implements IDispositivo{
    @Override
    public void encender() {
        System.out.println("Televisor encendido");
    }

    @Override
    public void apagar() {
        System.out.println("Televisor apagado");
    }
}
