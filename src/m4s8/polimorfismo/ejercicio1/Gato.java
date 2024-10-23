package m4s8.polimorfismo.ejercicio1;

public class Gato extends Animal{
    private String Color;
    //constructor con el atributo de la clase padre
    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public void emitirSonido(){
        System.out.println("Miau...");
        System.out.println("Miau...");

    }

}

