
public class App {
    public static void main(String[] args) {

        Vehicle v1 = new Vehicle();
        System.out.println("------");

        System.out.println(Vehicle.CAMP_STATIC);
        Vehicle.CAMP_STATIC = "camp static modificat";
        System.out.println(Vehicle.CAMP_STATIC);
        System.out.println("[+] Camps no finals es poden modificar un cop definits");
        System.out.println("------");

        System.out.println(Vehicle.CAMP_FINAL_STATIC);
        System.out.println(v1.CAMP_FINAL_INSTANCIA);
        System.out.println("[+] Els camps finals no es poden modificar un cop definits");



    }
}
