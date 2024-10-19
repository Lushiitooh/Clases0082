package m4s7.herencia.animales;

//sub clase que hereda los atributos de la clase Animal
public class Perro extends Animal {
    private String raza;

    //Constructor lleno
    public Perro(String nombre, int edad, String raza) {
        super (nombre, edad); //sirve para llamar a los atributos inicializados de la clase Super
        this.raza = raza;
    }

    @Override
    public void comer () {
        System.out.println("El perro " + nombre + " está comiendo.");
    }

    @Override
    public void dormir () {
        System.out.println("El perro " + nombre + " está durmiendo.");
    }



}
