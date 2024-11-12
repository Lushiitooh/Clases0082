package m4s10.ejerciciointermedio;

/*
Crea una clase Empleado abstracta que tenga el metodo calcularSalario()
y atributos nombre y salarioBase.
Crea dos clases derivadas Gerente e Ingeniero,
cada una con su propio cálculo de salario.
En el metodo principal, permite agregar empleados y calcular el total de
salarios en una clase Empresa.

Cumple con SRP, evita duplicación de código (DRY) y
permite agregar nuevos tipos de empleados sin modificar la clase base (Empleado),
respetando OCP.
 */

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        Empleado gerente1 = new Gerente("Javier", "Sastre", 500.0, 100.0, 30.0, 70.0);
        Empleado ingeniero1 = new Ingeniero("Alberto","Cortes", 350.0,600.0,1450.0);

        empresa.agregarEmpleado(gerente1);
        empresa.agregarEmpleado(ingeniero1);

        System.out.println(gerente1.calcularSalario());
        System.out.println(ingeniero1.calcularSalario());
        //mostrar el total de salarios
        System.out.println("Total de salarios: " + empresa.calcularSalario());
    }
}
