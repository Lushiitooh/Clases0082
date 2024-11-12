package m4s8.polimorfismo.ejercicio1;
//Clase Padre
public class Animal implements HacerSonido{
    protected String nombre;
    //constructor
    public Animal(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    @Override
    public void emitirSonido() {

    }

}
