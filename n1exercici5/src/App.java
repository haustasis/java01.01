
public class App {

    public static void main(String[] args) {

        Gat gat1 = new Gat();
        gat1.correr();
        gat1.correr("botes");
        gat1.correr("samarreta", 10);
        gat1.correr("ulleres", 100, true);
        gat1.correr("botes", "ulleres");

    }
}
