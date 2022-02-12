/*
Exercici 2. A la classe Vehicle afegeix dos mètodes: un static anomenat parar() i un altre no-static anomenat accelerar().
 Demostra com invocar el mètode static i el no-static des del main() (per exemple, enviant un missatge a la consola).
 */

public class App {

    public static void main(String[] args) {
        Vehicle.parar();
        Vehicle v1 = new Vehicle();
        v1.accelerar();
    }

}
