package m4s14.ejemplos;

public class EjemploIIlegalArgumentException {
    public static void main(String[] args) {
        try{
            setEdad(10);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
    //metodo
    public static void setEdad(int edad) {
        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser numero negativo");
        }
        System.out.println("edad establecida en : " + edad);
    }
}
