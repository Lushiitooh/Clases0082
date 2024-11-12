package m4s11.patronesestructurales.bridge;

class ControlAvanzado extends ControlRemoto{

    public ControlAvanzado(IDispositivo dispositivo) {
        super(dispositivo);
    }

    @Override
    void encender() {
        dispositivo.encender();
    }

    @Override
    void apagar() {
        dispositivo.apagar();
    }
}
