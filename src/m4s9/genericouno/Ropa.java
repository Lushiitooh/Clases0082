package m4s9.genericouno;

public class Ropa extends Producto<String>{
    private String color;

    public Ropa (String Producto, String color) {
        super(Producto);
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("nombre producto: "+ getProducto());
        System.out.println("Color: "+ color);
    }
}
