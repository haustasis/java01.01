
public class Animal {

    public void correr() {
        System.out.println("Animal correr lliure");
    }

    public void correr(String str) {
        System.out.println("Animal correr amb string " + str);
    }

    public void correr(String str, int num) {
        System.out.println("Animal correr amb string " + str + " amb numero " + num);
    }

    public void correr(String str, int num, boolean b) {
        System.out.println("Animal correr amb string " + str + " amb numero " + num + " amb boolen " + b);
    }

}
