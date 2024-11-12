package m4s11.patronesestructurales.bridge;

abstract class ControlRemoto{
    protected IDispositivo dispositivo;

    public ControlRemoto(IDispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    abstract void encender();
    abstract void apagar();
}
