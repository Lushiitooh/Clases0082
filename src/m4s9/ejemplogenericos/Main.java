package m4s9.ejemplogenericos;

public class Main {
    public static void main(String[] args) {
    Par<Integer, String> par1 = new Par<>(5000,"Esto se transformo en un String");
    par1.mostrarTipos();
        System.out.println("Primero: "+ par1.getPrimero());
        System.out.println("Segundo: " + par1.getSegundo());

    Par<Double, Boolean> par2 = new Par<>(2.58978744,true);
    par2.mostrarTipos();
    System.out.println("Primero: "+ par2.getPrimero());
    System.out.println("Segundo: "+ par2.getSegundo());

    Par<String,String> usuario = new Par<>("Jose","Silva");
    usuario.mostrarTipos();
    System.out.println("Primero: "+ usuario.getPrimero());
    System.out.println("Segundo: "+ usuario.getSegundo());



    }
}
