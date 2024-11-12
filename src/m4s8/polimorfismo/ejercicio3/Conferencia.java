package m4s8.polimorfismo.ejercicio3;


public class Conferencia extends EventoBase{
    private String ponentePrincipal;
    private String tema;


   public Conferencia(String nombreEvento, String lugar, String fecha, int precioEntrada, int AsistentesEvento, String ponentePrincipal, String tema) {
        super(nombreEvento, lugar, fecha, precioEntrada, AsistentesEvento);
        this.ponentePrincipal = ponentePrincipal;
        this.tema = tema;
    }

    public String getPonentePrincipal() {
        return ponentePrincipal;
    }

    public void setPonentePrincipal(String ponentePrincipal) {
        this.ponentePrincipal = ponentePrincipal;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }


    @Override
    public void mostrarDetalles() {
        System.out.println("Concierto: " + getNombreEvento());
        System.out.println("Lugar: " + getLugar());
        System.out.println("Fecha: " + getFecha());
        System.out.println("Precio: " + getPrecioEntrada());
        System.out.println("Ponente Principal: " + getPonentePrincipal());
        System.out.println("Tema de conversacion: " + getTema());
        System.out.println("Cantidad de asistentes: " + getAsistentesEvento());
        System.out.println("El valor total considerando asistentes y precio de entrada es de: "+ calcularAsistentes());
    }

}
