package m4s8.polimorfismo.ejercicio2;

public class Circulo extends Forma{
    private double radio;
    private double pi; // 3.14

    //contructor
    public Circulo(String color, String tamano, double radio, double pi) {
        super(color, tamano);
        this.radio = Math.pow(radio, 2);
        this.pi = pi;
    }


    @Override
    public double calcularArea(){
        return pi*radio;
    }
}
