/*
Exercici 4. A la classe Vehicle afegeix un camp static final, un camp final i un camp static.
Demostra la diferència entre els tres. Quins es poden inicialitzar al constructor de la classe?

 */
public class Vehicle {

    private final static String CAMP_FINAL_STATIC = "camp final static";
    private final String CAMP_FINAL_INSTANCIA;
    private static String CAMP_STATIC;
    private String CAMP_INSTANCIA;

    public Vehicle() {
        System.out.println("Constructor");
        CAMP_FINAL_INSTANCIA = "camp final instancia";
        System.out.println("CAMP FINAL inici al constructor");
        CAMP_STATIC = "camp static";
        System.out.println("CAMP STATIC inici al constructor");
    }

    public void metodeInstancia() {
        System.out.println("[+] Mètode d'instància");
    }

    public static void metodeEstatic() {
        System.out.println("[+] Mètode estàtic");
    }

}
