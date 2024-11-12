package m4s8.polimorfismo.ejercicio3;

/*
Clase base abstracta EventoBase: Implementa la interfaz Evento y define los atributos comunes:
nombreEvento (nombre del evento)
lugar (ubicación del evento)
fecha (fecha del evento)
precioEntrada (precio de la entrada)
 */

public class EventoBase implements IEvento{
    private String nombreEvento;
    private String lugar;
    private String fecha;
    private int precioEntrada;
    private int AsistentesEvento;

   //contructor
    public EventoBase(String nombreEvento, String lugar, String fecha, int precioEntrada,  int AsistentesEvento) {
        this.nombreEvento = nombreEvento;
        this.lugar = lugar;
        this.fecha = fecha;
        this.precioEntrada = precioEntrada;
        this.AsistentesEvento = AsistentesEvento;
    }

    public String getNombreEvento() {
        return nombreEvento;
    }

    public void setNombreEvento(String nombreEvento) {
        this.nombreEvento = nombreEvento;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(int precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    public int getAsistentesEvento() {
        return AsistentesEvento;
    }

    public void setAsistentesEvento(int asistentesEvento) {
        AsistentesEvento = asistentesEvento;
    }

    @Override
    public void mostrarDetalles() {

    }

    @Override
    public int calcularAsistentes() {
        return (getPrecioEntrada() * getAsistentesEvento());
    }

}
