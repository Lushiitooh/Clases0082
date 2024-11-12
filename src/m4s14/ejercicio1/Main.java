package m4s14.ejercicio1;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean verificador = true;
    while(verificador) {
            try{
                System.out.println("ingrese un numero numerador");
                int numerador = sc.nextInt();
                sc.nextLine();

                System.out.println("ingrese un numero denominador");
                int denominador = sc.nextInt();
                sc.nextLine();

                double resultado = dividir(numerador, denominador);
                System.out.println("El resultado es: " + resultado);
                verificador = false;
            }
            catch(ArithmeticException e){
                System.out.println("Excepcion " +e.getMessage());
                System.out.println("");
            }
            catch(Exception e){
                System.out.println("error: debe ingresar un numero.");
                System.out.println("");
                sc.nextLine();
            }
            finally {
                System.out.println("Operacion fin");

            }

        }
        sc.close();



    }// 5/2 2.5
    public static double dividir(int a, int b) throws ArithmeticException {
        if(b==0){
            throw new ArithmeticException("error: no se puede dividir por cero.");
        }
        return(double) a/b;
    }
}
