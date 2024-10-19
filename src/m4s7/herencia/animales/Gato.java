package m4s7.herencia.animales;

public class Gato extends Animal {
   private String color;

   public Gato(String nombre, int edad, String color) {
       super (nombre, edad);
       this.color = color;
   }

    @Override
    public void comer() {
        System.out.println("El gato "+ nombre + " está comiendo.");
    }

    @Override
    public void dormir() {
        System.out.println("El gato "+ nombre + " está durmiendo.");
    }


}
