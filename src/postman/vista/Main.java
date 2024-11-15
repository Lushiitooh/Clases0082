/*package vista;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import modelo.Location;

public class Main {
    public static void main(String[] args) {
        // Crear cliente para hacer solicitudes HTTP
        Client client = ClientBuilder.newClient();

        // URL de la API de geolocalización
        WebTarget target = client.target("https://ipapi.co/json/");

        // Realizar solicitud GET
        Response response = target.request(MediaType.APPLICATION_JSON).get();

        if (response.getStatus() == 200) {
            // Mapear la respuesta JSON a un objeto Location
            Location location = response.readEntity(Location.class);

            // Mostrar la ubicación obtenida
            System.out.println("Resultado de la geolocalización:");
            System.out.println(location);
        } else {
            System.out.println("Error en la solicitud: Código " + response.getStatus());
        }

        // Cerrar la respuesta y el cliente
        response.close();
        client.close();
    }
}*/
