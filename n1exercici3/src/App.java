/*
Exercici 3. Demostra que el procés de càrrega d'una classe només té lloc una vegada.
Demostra que la càrrega pot ser provocada per la creació de la primera instància d'aquesta classe
o per l'accés a un membre estàtic d'aquesta.
Idea: Cerca informació sobre els blocs d'inicialització a Java.
 */

public class App {

    public static void main(String[] args) {
        Vehicle.metodeEstatic();
        System.out.println("------");

        Vehicle v1 = new Vehicle();
        v1.metodeInstancia();
        System.out.println("------");

        Vehicle v2 = new Vehicle();
        v1.metodeInstancia();
        System.out.println("------");
    }

}