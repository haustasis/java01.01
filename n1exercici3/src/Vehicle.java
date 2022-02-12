

public class Vehicle {

    static {
        System.out.println("[+] Bloc inicialitzador static Vehicle class");
    }

    {
        System.out.println("[+] Bloc inicializador d'instancia");
    }

    public Vehicle() {
        System.out.println("[+] Metode constructor");
    }

    public void metodeInstancia() {
        System.out.println("[+] Mètode d'instància");
    }

    public static void metodeEstatic() {
        System.out.println("[+] Mètode estàtic");
    }


}
