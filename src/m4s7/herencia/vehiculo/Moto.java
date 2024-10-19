package m4s7.herencia.vehiculo;

public class Moto extends Vehiculo implements Electricidad{
    private String marca;
    public Moto(int numeroRuedas, int velocidadMaxima, String marca) {
        super(numeroRuedas, velocidadMaxima);
        this.marca = marca;
    }

    @Override
    public void arrancar() {
        System.out.println("La moto marca : " + marca + " está Arrancando.");
    }

    @Override
    public void detener() {
        System.out.println("La moto marca : " + marca + " está Deteniendo");
    }

    @Override
    public void cargarBateria() {
        System.out.println("La moto marca : " + marca + " está Cargar bateria");
    }
}
