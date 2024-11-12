package m4s9.genericouno;

public class Electronico extends Producto<String>{
    private String marca;

    public Electronico(String producto, String marca){
        super(producto);
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public void mostrarDetalles(){
        System.out.println("nombre producto: "+getProducto());
        System.out.println("Nombre marca: " + marca);
    }
}
