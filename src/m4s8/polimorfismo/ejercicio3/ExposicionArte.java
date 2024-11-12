package m4s8.polimorfismo.ejercicio3;

import lombok.Data;


public class ExposicionArte extends EventoBase{

    private String artistaPrincipal;
    private int numeroDeObras;

    public ExposicionArte(String nombreEvento, String lugar, String fecha, int precioEntrada, int AsistentesEvento, String artistaPrincipal, int numeroDeObras) {
        super(nombreEvento, lugar, fecha, precioEntrada, AsistentesEvento);
        this.artistaPrincipal = artistaPrincipal;
        this.numeroDeObras = numeroDeObras;
    }

    public String getArtistaPrincipal() {
        return artistaPrincipal;
    }

    public void setArtistaPrincipal(String artistaPrincipal) {
        this.artistaPrincipal = artistaPrincipal;
    }

    public int getNumeroDeObras() {
        return numeroDeObras;
    }

    public void setNumeroDeObras(int numeroDeObras) {
        this.numeroDeObras = numeroDeObras;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Concierto: " + getNombreEvento());
        System.out.println("Lugar: " + getLugar());
        System.out.println("Fecha: " + getFecha());
        System.out.println("Precio: " + getPrecioEntrada());
        System.out.println("Artista Principal: " + getArtistaPrincipal());
        System.out.println("Cantidad de obras: " + getNumeroDeObras());
        System.out.println("Cantidad de asistentes: " + getAsistentesEvento());
        System.out.println("El valor total considerando asistentes y precio de entrada es de: "+ calcularAsistentes());
    }

}
