package m4s8.polimorfismo.ejercicio2;

public class Rectangulo extends Forma{
    private double largo;
    private double ancho;


    public Rectangulo(String color, String tamano, double largo, double ancho) {
        super(color, tamano);
        this.largo = largo;
        this.ancho = ancho;
    }

    @Override
    public double calcularArea() {
        return largo * ancho;
    }


}
