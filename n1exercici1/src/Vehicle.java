/*
Exercici 1. Crea una classe Vehicle amb un constructor i un mètode anomenat iniciar(),
que es invocat pel main() (aquest mètode pot estar en la mateixa classe o en una classe apart) .
Demostra la seqüència d'execució dels mètodes de la classe (per exemple, enviant un missatge a la consola).
 */

// Crea una classe Vehicle
public class Vehicle {

    public Vehicle() {
        System.out.println("[+] Metode constructor Vehicle class");
    }

    public void iniciar() {
        System.out.println("[+] Metode Iniciar Vehicle class");
    }

}