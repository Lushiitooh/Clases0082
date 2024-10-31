package m4s11.patronescreacionales.patronsingleton;

public class Main {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstancia();//crea la instacia
        Singleton s2 = Singleton.getInstancia();// realiza el llamado de que ya existe la instacia
    }
}
