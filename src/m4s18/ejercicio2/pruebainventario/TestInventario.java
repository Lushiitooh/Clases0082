/*package m4s18.ejercicio2.pruebainventario;

import m4s18.ejercicio2.Inventario;
import org.junit.jupiter.api.*;

 import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Prueba de gestion de inventario")
public class TestInventario {
    private final Inventario inventario = new Inventario();

    @BeforeEach
    void setUp() {
        inventario.agregarProducto("Manzanas",10);
        inventario.agregarProducto("Mango",5);
    }

    @Test
    @DisplayName("Test para agregar productos")
    void testAgregarProducto() {
        inventario.agregarProducto("Manzanas",10);
        assertEquals(20,inventario.obtenerCantidad("Manzanas"),"Deberian haber 10 Peras");
        System.out.println(inventario.obtenerCantidad("Manzanas"));
    }

    @Test
    @DisplayName("Retirar la fruta")
    void testRetirarFruta() {
        inventario.retirarProducto("Manzanas",5);
        assertEquals(5,inventario.obtenerCantidad("Manzanas"),"deberian ser 5 manzanas");
    }

    @Test
    @DisplayName("Test para cantidad insuficiente")

    void testCantidadInsuficiente() {
        assertThrows(IllegalArgumentException.class, () -> inventario.retirarProducto("Manzanas",15),"deberia lanzar un mensaje de excepcion de cantidad");
    }



}*/
