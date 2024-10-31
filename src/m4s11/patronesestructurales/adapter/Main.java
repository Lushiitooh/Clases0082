package m4s11.patronesestructurales.adapter;
//Adapter: pertmite que 2 interfaces incompatibles trabajen juntas
public class Main {
    public static void main(String[] args) {
        EnchufeAmericano enchufeAmericano = new EnchufeAmericano();
        IEnchufeEuropeo adaptador = new AdaptadorEnchufe(enchufeAmericano);
        adaptador.enchufar();
    }

}
