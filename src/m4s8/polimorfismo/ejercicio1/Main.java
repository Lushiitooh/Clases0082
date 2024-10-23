package m4s8.polimorfismo.ejercicio1;
/*
 * Crea una interfaz llamada HacerSonido con un metodo emitirSonido().
 * Luego, crea una clase super Animal que implemente esta interfaz.
 * A partir de esta clase, crea tres clases hijas: Perro, Gato y Pájaro.
 * Cada una debe implementar el metodo emitirSonido() para hacer un sonido diferente.
 */
public class Main {
    public static void main(String[] args) {
    Animal miPerro = new Perro("Lilith");
    miPerro.emitirSonido();

    Animal miPajaro = new Pajaro("Pepe");
    miPajaro.emitirSonido();

    Animal miGato = new Gato("Federico");
        System.out.println(miGato.getNombre());
        miGato.emitirSonido();
    }

}

