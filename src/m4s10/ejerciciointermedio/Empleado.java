package m4s10.ejerciciointermedio;

public abstract class Empleado {
    protected String nombre;
    protected String apellido;
    protected double sueldoBase;

    public Empleado(String nombre, String apellido, double sueldoBase) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldoBase = sueldoBase;
    }

    public Empleado() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public abstract double calcularSalario();
}
