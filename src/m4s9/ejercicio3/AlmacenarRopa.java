package m4s9.ejercicio3;

public class AlmacenarRopa extends Almacen<Ropa> {
    @Override
    protected Ropa crearElemento(String nombre) {
        return new Ropa(nombre);
    }
}
