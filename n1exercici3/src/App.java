
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