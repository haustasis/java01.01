/*

Exercici 8. Modifica l'exercici anterior perquè l'objecte Frog
substitueixi les definicions de mètodes de la classe base
(proporcioni noves definicions utilitzant les mateixes signatures de mètodes).
Demostri que ocorre al mètode main(), si manté la generalització anterior o no.
 */


public class App {
    public static void main(String[] args) {

        Amphibian amp1 = new Frog();
        amp1.moure();
        amp1.respirar();
        amp1.menjar();


    }
}