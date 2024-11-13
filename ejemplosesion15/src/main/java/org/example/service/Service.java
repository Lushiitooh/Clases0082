package org.example.service;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

//https://jsonplaceholder.typicode.com/
public class Service {
    public static void obtenerPostbyId(int postid){
        String urlApi = "https://jsonplaceholder.typicode.com/posts/"+postid;

        try{
            URL url = new URL(urlApi);
            HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
            conexion.setRequestMethod("GET");

            //Leer la respuesta
            BufferedReader leer = new BufferedReader(new InputStreamReader(conexion.getInputStream()));
            String linea;
            StringBuilder contenido = new StringBuilder();
            while((linea = leer.readLine()) != null){
                contenido.append(linea);
            }
            leer.close();

            //procesar JSON
            JsonObject post = JsonParser.parseString(contenido.toString()).getAsJsonObject();
            System.out.println("Titulo: " + post.get("title").getAsString());
            System.out.println("Cuerpo: " + post.get("body").getAsString());



        }catch(Exception e){
            System.out.println("Error" + e.getMessage());
        }
    }

    public static void comentariosPorId(int postId){
        String urlApi2 = "https://jsonplaceholder.typicode.com/posts/"+postId + "/comments";
        try{
            URL url2 = new URL(urlApi2);
            HttpURLConnection conexion2 = (HttpURLConnection) url2.openConnection();
            conexion2.setRequestMethod("GET");

            //Leer Respuesta
            BufferedReader leer = new BufferedReader(new InputStreamReader(conexion2.getInputStream()));
            String linea;
            StringBuilder contenido = new StringBuilder();
            while((linea = leer.readLine()) != null){
                contenido.append(linea);
            }
            leer.close();

            //Procesar datos JSON
            JsonArray comentarios = JsonParser.parseString(contenido.toString()).getAsJsonArray();
            for(int i =0; i < comentarios.size(); i++){
                JsonObject comentario = comentarios.get(i).getAsJsonObject();
                System.out.println("Nombre: "+ comentario.get("name").getAsString());
                System.out.println("Correo: "+ comentario.get("email").getAsString()) ;
                System.out.println("Cuerpo: "+ comentario.get("body").getAsString());
                System.out.println("---------------------------------------------");
            }



        } catch (Exception e) {
            System.out.println("error " + e.getMessage());
        }
    }

    public static void obtenerTodosLosUsuarios(){
        try{
            URL url = new URL("https://jsonplaceholder.typicode.com/users");
            HttpURLConnection conexionURL = (HttpURLConnection) url.openConnection();
            conexionURL.setRequestMethod("GET");

            BufferedReader leerInformacion = new BufferedReader(new InputStreamReader(conexionURL.getInputStream()));
            String lineaDeDatos;
            StringBuilder contenidoDeURL = new StringBuilder();
            while((lineaDeDatos = leerInformacion.readLine()) != null){
                contenidoDeURL.append(lineaDeDatos);
            }
            leerInformacion.close();

            JsonArray usuarios = JsonParser.parseString(contenidoDeURL.toString()).getAsJsonArray();
            for(int i =0; i < usuarios.size(); i++){
                JsonObject usuarioUnitario = usuarios.get(i).getAsJsonObject();
                System.out.println("ID: " + usuarioUnitario.get("id").getAsInt());
                System.out.println("Nombre: " + usuarioUnitario.get("name").getAsString());
                System.out.println("Nombre de Usuario: " + usuarioUnitario.get("username").getAsString());
                System.out.println("Correo: " + usuarioUnitario.get("email").getAsString());
                System.out.println("Direccion: ");
                System.out.println("Calle: " + usuarioUnitario.getAsJsonObject("address").get("street").getAsString());
                System.out.println("Enumeración: " + usuarioUnitario.getAsJsonObject("address").get("suite").getAsString());
                System.out.println("Ciudad: " + usuarioUnitario.getAsJsonObject("address").get("city").getAsString());
                System.out.println("Codigo Postal: " + usuarioUnitario.getAsJsonObject("address").get("zipcode").getAsString());
                System.out.println("Geo");
                System.out.println("Latitud: " + usuarioUnitario.getAsJsonObject("address").getAsJsonObject("geo").get("lat").getAsString());
                System.out.println("Longitud: " + usuarioUnitario.getAsJsonObject("address").getAsJsonObject("geo").get("lng").getAsString());
                System.out.println("Telefono: " + usuarioUnitario.get("phone").getAsString());
                System.out.println("Pagina Web: " + usuarioUnitario.get("website").getAsString());
                System.out.println("Nombre Compañia: " + usuarioUnitario.getAsJsonObject("company").get("name").getAsString());
                System.out.println("Frase de Captura: " + usuarioUnitario.getAsJsonObject("company").get("catchPhrase").getAsString());
                System.out.println("BS: " + usuarioUnitario.getAsJsonObject("company").get("bs").getAsString());

                System.out.println("------------------------------------------------");
            }
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }
    }


}
