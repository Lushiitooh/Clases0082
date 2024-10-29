package m4s10.ejerciciointermedio;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Empleado> listaEmpleados = new ArrayList<>();

    public void agregarEmpleado(Empleado emp) {
        listaEmpleados.add(emp);
    }

    public double calcularSalario() {
        double totalSalario = 0.0;
        for (Empleado emp : listaEmpleados) {
            totalSalario += emp.calcularSalario();
        }
        return totalSalario;
    }

}





