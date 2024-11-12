package model;
//empresa de venta de licores
// Clientes : encargados de realizar compras
// Productos: //cervezas, ipa, ale, red
// Vinos tinto blanco espumantes
               //tinto: merlot, carmenere, cabernet sauvignon
               //blanco: moscatel, sauvignon blanc
//Inventario: Stock de cada producto. // .txt con inventario
//añadir carrito de compras por cliente.
//Tipo de Pago.
//venta: .txt que guarde las ventas
//registro de compras de cada cliente que se vaya añadiendo.
//Calculo de compras por detalle (menor a 5) y por mayor(sobre 5)
//retiro en tienda o reparto a domicilio(adicional extra en dinero)
//si la compra es mas de 30mil gratis.
//consultar si es boleta o factura (si es boleta que se registre la venta)
// (si es factura, solicitar datos de la empresa cliente.
//provedores: 3 proveedores de alcohol
//crear EmpresaCliente
//crear codigo promocional para descuento; //txt codigos de promoción
//menu del usuario.



public class Cliente {
    private int IdCliente;
    private String nombre;
    private String correoElectronico;
    private String telefono;
    private String direccion;

    public Cliente(int idCliente, String nombre, String correoElectronico, String telefono, String direccion) {
        IdCliente = idCliente;
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public int getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(int idCliente) {
        IdCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "IdCliente=" + IdCliente +
                ", nombre='" + nombre + '\'' +
                ", correoElectronico='" + correoElectronico + '\'' +
                ", telefono='" + telefono + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
