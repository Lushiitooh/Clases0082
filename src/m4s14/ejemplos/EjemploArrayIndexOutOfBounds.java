package m4s14.ejemplos;

public class EjemploArrayIndexOutOfBounds {
    public static void main(String[] args) {
        //Try = intentar ejecutar el codigo
        //catch = es el que captura la excepcion si ocurre un error en el TRY
        //finally: se ejecuta independientemente de que ocurra una excepcion o funcione el TRY.

        int[] array = null;
        try { //0,1,2
            array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
            System.out.println(array[9]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: indice fuera de rango.");
        }
    }
}
