package m4s14.ejemplos;

public class EjemploArithmeticExcepcion {
    public static void main(String[] args) {

        try {
            System.out.println(dividir(10, 5));
        } catch (ArithmeticException e) {
            System.out.println("Error, no se puede dividir por cero" + e.getMessage());
        }
        System.out.println("prueba de que la aplicacion sigue funcionando despues de que no se pudo dividir");
    }


    public static int dividir(int a, int b) throws ArithmeticException {
        return a / b;
    }
}
