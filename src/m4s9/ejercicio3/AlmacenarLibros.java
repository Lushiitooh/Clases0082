package m4s9.ejercicio3;

public class AlmacenarLibros extends Almacen<Libro> {
    @Override
    protected Libro crearElemento(String nombre){
        return new Libro(nombre);
    }
}
