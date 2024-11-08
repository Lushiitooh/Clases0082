package m4s14.ejemplos;

public class Throw {
    public static void main(String[] args) {
        //throw permite lanzar manualmente una excepcion personalizada utilizando palabra clave NEW
        verificarEdad(15);

    }
    static void verificarEdad(int edad){
        if(edad<18){
            throw new ArithmeticException("Debe ser mayor que 18");
        }else{
            System.out.println("edad valida.");
        }

    }


}
