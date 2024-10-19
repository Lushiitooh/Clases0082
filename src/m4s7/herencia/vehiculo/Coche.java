package m4s7.herencia.vehiculo;

public class Coche extends Vehiculo implements Electricidad {
    private String modelo;

    public Coche(int numeroRuedas, int velocidadMaxima, String modelo) {
        super(numeroRuedas, velocidadMaxima);
        this.modelo = modelo;
    }

    @Override
    public void arrancar() {
        System.out.println("El coche " + modelo + " esta arrancado.");

    }

    @Override
    public void detener() {
        System.out.println("El coche " + modelo + " se ha detenido.");
    }

    @Override
    public void cargarBateria() {
        System.out.println("El coche " + modelo + " esta cargando su bateria.");
    }
}
