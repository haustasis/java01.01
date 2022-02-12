/*
Exercici 2. A la classe Vehicle afegeix dos mètodes: un static anomenat parar() i un altre no-static anomenat accelerar().
 Demostra com invocar el mètode static i el no-static des del main() (per exemple, enviant un missatge a la consola).
 */

public class Vehicle {

    public Vehicle() {
        System.out.println("[-] Metode constructor Vehicle class");
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
