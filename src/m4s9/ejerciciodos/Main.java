package m4s9.ejerciciodos;

public class Main {
    public static void main(String[] args) {


        Bolsa<Zapatos> zapatosBolsa = new Bolsa<>(3);
        zapatosBolsa.agregarProducto(new Zapatos("Nike"));
        zapatosBolsa.agregarProducto(new Zapatos("Adidas"));
        zapatosBolsa.agregarProducto(new Zapatos("Puma"));
        zapatosBolsa.agregarProducto(new Zapatos("BattleNet"));
        zapatosBolsa.mostrarProductos();


        System.out.println("----------------------------------------");

        Bolsa<Poleras> polerasBolsa = new Bolsa<>(2);
        polerasBolsa.agregarProducto(new Poleras("Verde"));
        polerasBolsa.agregarProducto(new Poleras("Azul"));
        polerasBolsa.agregarProducto(new Poleras("Rojo"));
        polerasBolsa.mostrarProductos();


    }
}
