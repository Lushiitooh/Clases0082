package m4s8.polimorfismo.ejercicio2;

public class Forma implements Calculable {
    private String color;
    private String tamano;
    //Contructor

    public Forma(String color, String tamano) {
        this.color = color;
        this.tamano = tamano;
    }

    public String getColor() {
        return color;
    }

    public String getTamano() {
        return tamano;
    }

    @Override
    public double calcularArea(){
        return 0;
    }


}
