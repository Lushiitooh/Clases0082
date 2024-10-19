/*
 * Crea un programa en Java para modelar diferentes tipos de animales. Debes seguir los siguientes pasos:

Crear una superclase llamada Animal con atributos nombre y edad, y métodos comer() y dormir().
Crear dos subclases llamadas Perro y Gato que extiendan de Animal.
Añadir un atributo propio a cada subclase: raza para Perro y color para Gato.
Sobrescribir el metodo comer() en cada subclase para que describa cómo se alimenta cada animal.
En Main instanciar objetos de Perro y Gato, e invoques sus métodos.
 */

package m4s7.herencia.animales;

public class Main {
    public static void main(String[] args) {
        Perro dog = new Perro("Luna", 9, "Pastor Alemán");
        Gato gato = new Gato("Lupe", 1, "Negro");

        dog.comer();
        dog.dormir();
        gato.comer();
        gato.dormir();
        dog.dormir();
        dog.comer();
        dog.dormir();
        dog.comer();


    }

}
