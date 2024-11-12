package m4s10.ejerciciointermedio;

public class Gerente extends Empleado{
    //4990 dolares
    private double bonoReuniones;
    private double horas;
    private double bonoMetas;

    public Gerente(String nombre, String apellido, double sueldoBase, double bonoReuniones, double horas, double bonoMetas) {
        super(nombre, apellido, sueldoBase);
        this.bonoReuniones = bonoReuniones;
        this.horas = horas;
        this.bonoMetas = bonoMetas;
    }

    public double getBonoReuniones() {
        return bonoReuniones;
    }

    public void setBonoReuniones(double bonoReuniones) {
        this.bonoReuniones = bonoReuniones;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public double getBonoMetas() {
        return bonoMetas;
    }

    public void setBonoMetas(double bonoMetas) {
        this.bonoMetas = bonoMetas;
    }

    @Override
     public double calcularSalario() {
        return (sueldoBase + bonoMetas+(bonoReuniones * horas));
    }
}
