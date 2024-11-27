package m4s19.ejercicio1.test;

import static org.mockito.Mockito.*;
import m4s19.ejercicio1.model.Pedido;
import m4s19.ejercicio1.model.Producto;
import m4s19.ejercicio1.service.serviceimpl.PedidoServiceImpl;
import org.junit.jupiter.api.*;

import java.util.Arrays;

@DisplayName("Test de pedido servicio")
public class PedidoServiceTest {

    private PedidoServiceImpl pedidoService;

    @BeforeEach
    void setUp(){
        pedidoService = new PedidoServiceImpl();
    }
    @Test
    @DisplayName("Dummy: crear un pedido con productos irrelevantes")
    void testDummyPedido(){
        Producto dummyProducto = new Producto("Lavaloza",0.0);
        Pedido dummyPedido = new Pedido(Arrays.asList(dummyProducto));

        //Validar que no afecte el calculo()
        Assertions.assertEquals(0.0,pedidoService.calcularTotalPreciosProductos(dummyPedido),"no afecta el precio");
    }

    @Test
    @DisplayName("Stub: Simular un pedido con un total especifico")
    void testStubPedido(){
       Pedido stubPedido = mock(Pedido.class);
    }

}
