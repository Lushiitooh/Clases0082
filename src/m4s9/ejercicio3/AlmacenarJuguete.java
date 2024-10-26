package m4s9.ejercicio3;

public class AlmacenarJuguete extends Almacen<Juguete> {
    @Override
    protected Juguete crearElemento(String nombre){
        return new Juguete(nombre);
    } 
}
