package m4s10.ejercicioFacil;

public class Producto {
    //atributos de la clase
    private String nombre;
    private int precio;

    //contructor

    public Producto(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }
    //inicializamos que podamos obtener este atributo en otra clase
    public int getPrecio() {
        return precio;
    }

}
