package m4s8.polimorfismo.ejercicio3;

public class Concierto extends EventoBase{
    private String bandaPrincipal;


    public Concierto(String nombreEvento, String lugar, String fecha, int precioEntrada, int asistentesEvento, String bandaPrincipal) {
        super(nombreEvento, lugar, fecha,precioEntrada, asistentesEvento);
        this.bandaPrincipal = bandaPrincipal;
    }

    public String getBandaPrincipal() {
        return bandaPrincipal;
    }

    public void setBandaPrincipal(String bandaPrincipal) {
        this.bandaPrincipal = bandaPrincipal;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Concierto: " + getNombreEvento());
        System.out.println("Lugar: " + getLugar());
        System.out.println("Fecha: " + getFecha());
        System.out.println("Precio: " + getPrecioEntrada());
        System.out.println("Banda Principal: " + getBandaPrincipal());
        System.out.println("Cantidad de asistentes: " + getAsistentesEvento());
        System.out.println("El valor total considerando asistentes y precio de entrada es de: "+ calcularAsistentes());
    }
}
