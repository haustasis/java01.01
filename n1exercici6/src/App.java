

public class App {
    public static void main(String[] args) {

        System.out.println("Frog generalització a Amphibian");
        Amphibian amp1 = new Frog();
        amp1.moure();
        amp1.respirar();
        amp1.menjar();

    }
}
