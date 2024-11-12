package m4s14.ejemplos;

public class EjemploNumberFormatException {
    public static void main(String[] args) {
        // excepcion para capturar error al transformar una cadena de texto a entero
        try{
            String texto = "a"; // deben ir numeros entre las comillas
            int numero = Integer.parseInt(texto);
            System.out.println("Numero: " + numero);
        }catch(NumberFormatException e){
            System.out.println("Error: "+ e.getMessage());
        }
    }
}
