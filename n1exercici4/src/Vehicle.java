
public class Vehicle {

    public final static String CAMP_FINAL_STATIC = "camp final static";
    public final String CAMP_FINAL_INSTANCIA;
    public static String CAMP_STATIC;
    public String CAMP_INSTANCIA;

    public Vehicle() {
        System.out.println("Constructor");
        CAMP_FINAL_INSTANCIA = "camp final instancia";
        System.out.println("CAMP FINAL inici al constructor");
        CAMP_STATIC = "camp static";
        System.out.println("CAMP STATIC inici al constructor");
        CAMP_INSTANCIA = "camp instancia";
        System.out.println("CAMP INSTANCIA inici al constructor");
    }

    public void metodeInstancia() {
        System.out.println("[+] Mètode d'instància");
    }

    public static void metodeEstatic() {
        System.out.println("[+] Mètode estàtic");
    }

}
