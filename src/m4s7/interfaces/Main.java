package m4s7.interfaces;
/* Crea una interfaz llamada Vehiculo que defina los siguientes métodos:
void arrancar(): para encender el vehículo.
void detener(): para apagar el vehículo.

Crea una segunda interfaz llamada Electrico, que contenga:
void cargarBateria(): para cargar la batería de un vehículo eléctrico.

Crea una tercera interfaz llamada Combustible, que contenga:
void llenarTanque(): para llenar el tanque de combustible de un vehículo que usa gasolina.

Crea las siguientes clases que implementen las interfaces:

Clase CocheElectrico:
Implementa tanto la interfaz Vehiculo como la interfaz Electrico.
Debe tener atributos como modelo y nivelBateria, y debe implementar todos los métodos de las interfaces.

Clase MotoCombustion:
Implementa tanto la interfaz Vehiculo como la interfaz Combustible.
Debe tener atributos como modelo y nivelCombustible, y debe implementar todos los métodos de las interfaces.

En la clase principal (Main),
crea instancias de CocheElectrico y MotoCombustion.

Invoca sus métodos para demostrar cómo interactúan.*/

public class Main {
    public static void main(String[] args) {
        CocheElectrico coche1 = new CocheElectrico("Tesla 1", 100);
        MotoCombustion moto1 = new MotoCombustion("Kawasaki", 85);

        coche1.arrancar();
        coche1.detener();
        coche1.cargarBateria();

        moto1.arrancar();
        moto1.detener();
        moto1.llenarTanque();

    }
}


