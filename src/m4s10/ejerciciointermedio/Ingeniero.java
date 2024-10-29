package m4s10.ejerciciointermedio;

public class Ingeniero extends Empleado{
    private double bonoProduccion;
    private double bonoTerminoConflicto;

    public Ingeniero(String nombre, String apellido, double sueldoBase, double bonoProduccion, double bonoTerminoConflicto) {
        super(nombre, apellido, sueldoBase);
        this.bonoProduccion = bonoProduccion;
        this.bonoTerminoConflicto = bonoTerminoConflicto;
    }

    public double getBonoProduccion() {
        return bonoProduccion;
    }

    public void setBonoProduccion(double bonoProduccion) {
        this.bonoProduccion = bonoProduccion;
    }

    public double getBonoTerminoConflicto() {
        return bonoTerminoConflicto;
    }

    public void setBonoTerminoConflicto(double bonoTerminoConflicto) {
        this.bonoTerminoConflicto = bonoTerminoConflicto;
    }

    //2500 dolares
    @Override
    public double calcularSalario() {
        return sueldoBase + bonoProduccion + bonoTerminoConflicto;
    }
}
