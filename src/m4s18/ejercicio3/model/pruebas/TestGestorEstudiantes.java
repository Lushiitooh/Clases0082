package m4s18.ejercicio3.model.pruebas;

import m4s18.ejercicio3.model.Estudiante;
import m4s18.ejercicio3.model.GestorEstudiante;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


@DisplayName("Prueba de gestor de estudiantes")
public class TestGestorEstudiantes {
    private GestorEstudiante gestor;

    @BeforeEach
    void instanciar(){
        gestor = new GestorEstudiante();
        Estudiante estudiante1 = new Estudiante(1,"Bryan",true, 3.69);
        Estudiante estudiante2 = new Estudiante(2,"Exquiel",false,3.9);
        gestor.agregarEstudiante(estudiante1);
        gestor.agregarEstudiante(estudiante2);
    }

    @Test
    @DisplayName("Test para comparar resultados")
    void testCompararResultado(){
        Estudiante estudiante1 = gestor.buscarEstudiante(1);
        assertEquals("Bryan", estudiante1.getNombre(),"el estudiante si existe");
    }

    @Test
    @DisplayName("Test assertSame: Comparar objetos")
    void testAssertSame(){
        Estudiante estudiante1 = gestor.buscarEstudiante(2);
        Estudiante estudiante2 = gestor.buscarEstudiante(2);
        assertSame(estudiante1,estudiante2,"Ambos deben ser el mismo objeto");
    }

    @Test
    @DisplayName("Test assertNotSame: objetos son diferentes")
    void testAssertNotSame(){
        Estudiante estudiante1 = gestor.buscarEstudiante(1);
        Estudiante estudiante2 = gestor.buscarEstudiante(2);
        assertNotSame(estudiante1,estudiante2,"deben ser objetos diferentes");
    }

    @Test
    @DisplayName("Test assertNull: comprobar nulos")
    void testAssertNull(){
        Estudiante estudiante1 = gestor.buscarEstudiante(3);
        assertNull(estudiante1,"el estudiante deberia existir");
    }

    @Test
    @DisplayName("Test assertNotNull: comprobar no nulos")
    void testAssertNotNull(){
        Estudiante estudiante1 = gestor.buscarEstudiante(1);
        assertNotNull(estudiante1,"el estudiante deberia existir");
    }

    @Test
    @DisplayName("Test assertTrue: comprobar si es Verdadero")
    void testAssertTrue(){
        assertTrue(gestor.estaInscrito(1));

    }

    @Test
    @DisplayName("Test assertFalse: comprobar si es Falso")
    void testAssertFalse(){
        assertFalse(gestor.estaInscrito(2));

    }

    @Test
    @DisplayName("Test assertAlmostEqual: comparar numeros aproximados")
    void testAssertAlmostEqual(){
        Estudiante estudiante1 = gestor.buscarEstudiante(1);
        Estudiante estudiante2 = gestor.buscarEstudiante(2);
        assertEquals(4, estudiante1.getNota(),0.4);
        assertEquals(5, estudiante2.getNota(),1.3);

    }

    @Test
    @DisplayName("Test Actualizar Nota")
    void testActualizarNota(){
        gestor.actualizarNota(2,4.0);
        Estudiante estudiante = gestor.buscarEstudiante(2);
        assertNotNull(estudiante);
        assertEquals(4.0,estudiante.getNota());
    }


}
