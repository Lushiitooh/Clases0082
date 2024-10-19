package m4s7.herencia.animales;
//Clase Super
public class Animal {
    protected String nombre;
    protected int edad;

    public Animal(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public void comer() {
        System.out.println("Comer");
    }

    public void dormir() {
        System.out.println("Dormir");
    }

}
