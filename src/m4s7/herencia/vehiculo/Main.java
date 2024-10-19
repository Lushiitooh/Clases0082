/*
  Desarrolla un programa en Java que modele vehículos terrestres.

Crea una clase abstracta Vehiculo con atributos numeroRuedas
y velocidadMaxima, y métodos abstractos arrancar() y detener().

Define dos subclases, Coche y Moto, que hereden de Vehiculo.

Crea una interfaz Electricidad con el metodo cargarBateria().

Implementa esta interfaz en la clase Coche.
agregar atributo String modelo;

Instancia objetos en la clase principal y demuestra su funcionamiento.
 */

package m4s7.herencia.vehiculo;

public class Main {
    public static void main(String[] args) {
    Coche coche = new Coche(4,100,"Audi");
    Moto moto = new Moto(2,120,"Yamaha");

    coche.arrancar();
    coche.detener();
    coche.cargarBateria();

    moto.arrancar();
    moto.detener();
    moto.cargarBateria();

    }
}
