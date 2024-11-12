package m4s11.patronesestructurales.bridge;
//separar una abstraccion de su implementación,
// permitiendo que ambas evolucionen de manera independiente
public class Main {
    public static void main(String[] args) {
        IDispositivo televisor = new Televisor();
        ControlRemoto control = new ControlAvanzado(televisor);

        control.encender();
        control.apagar();
    }
}
