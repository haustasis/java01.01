
public class Frog extends Amphibian{

    @Override
    public void moure() {
        System.out.println("Està movent la frog");
    }

    @Override
    public void respirar() {
        System.out.println("Està respirant la frog");
    }

    @Override
    public void menjar() {
        System.out.println("Està menjant la frog");
    }

    public void saltar() {
        System.out.println("Està saltant la frog");
    }
}
