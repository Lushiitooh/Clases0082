package m4s8.polimorfismo.ejercicio2;
/*
 * Crea una interfaz llamada Calculable con un metodo calcularArea().
 *  Luego, crea una clase base abstracta Forma que implemente esta interfaz.
 *  A partir de esta clase, crea dos clases hijas: Rectangulo y Circulo.
 * Cada una debe implementar el metodo calcularArea()
 * para calcular el área específica de su forma.
 */
public class Main {
    public static void main(String[] args) {
        Forma Circulo1 = new Circulo("Negro","XXL",8,3.14);
        Forma area_Rectangulo = new Rectangulo("Blanco","XL",8,4);

        System.out.println("Area rectangulo de color "+area_Rectangulo.getColor()+ " es :" + area_Rectangulo.calcularArea());
        System.out.println("Area del circulo "+Circulo1.getColor()+" de tamaño " + Circulo1.getTamano()+ " es: " + Circulo1.calcularArea());
        
    }

}
