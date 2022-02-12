/*
Exercici 3. Demostra que el procés de càrrega d'una classe només té lloc una vegada.
Demostra que la càrrega pot ser provocada per la creació de la primera instància d'aquesta classe
o per l'accés a un membre estàtic d'aquesta.
Idea: Cerca informació sobre els blocs d'inicialització a Java.
 */

public class Vehicle {

    static {
        System.out.println("[+] Bloc inicialitzador static Vehicle class");
    }

    {
        System.out.println("[+] Bloc inicializador d'instancia");
    }

    public Vehicle() {
        System.out.println("[+] Metode constructor Vehicle class");
    }

    public void metodeInstancia() {
        System.out.println("[+] Mètode d'instància");
    }

    public static void metodeEstatic() {
        System.out.println("[+] Mètode estàtic");
    }

    public void iniciar() {
        System.out.println("[+] Metode Iniciar Vehicle class");
    }

    public static void parar() {
        System.out.println("[+] Metode Static Parar Vehicle class");
    }

    public void accelerar() {
        System.out.println("[+] Metode Non-Static Accelerar Vehicle class");
    }

}
