package m4s9.genericouno;

public class Alimento extends Producto<String>{

    private String fechaVencimiento;

    public Alimento (String producto, String fechaVencimiento ){
        super(producto);
        this.fechaVencimiento = fechaVencimiento;
    }

   public String getFechaVencimiento() {
        return fechaVencimiento;
   }

   public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
   }

   @Override
    public void mostrarDetalles(){
       System.out.println("Nombre del alimento: "+getProducto());
       System.out.println("La fecha de vencimiento es: " + fechaVencimiento);
   }
}
