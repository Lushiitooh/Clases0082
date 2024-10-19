package m4s7.herencia.vehiculo;
/*
Crea una clase abstracta Vehiculo con atributos numeroRuedas
y velocidadMaxima, y métodos abstractos arrancar() y detener().
 */
public abstract class Vehiculo {
    protected int numeroRuedas;
    protected int velocidadMaxima;
    //Constructor
    public Vehiculo(int numeroRuedas, int velocidadMaxima) {
        this.numeroRuedas = numeroRuedas;
        this.velocidadMaxima = velocidadMaxima;
    }

    public abstract void arrancar();
    public abstract void detener();

}
