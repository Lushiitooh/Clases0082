package m4s8.polimorfismo.ejercicio1;

public class Pajaro extends Animal{

    public Pajaro(String nombre){
        super(nombre);
    }

    @Override
    public void emitirSonido() {
        System.out.println("Pío.");

    }

}
