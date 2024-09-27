package day3;

public class App {
    public static void main(String[] args) {
        Cat bianca = new Cat("Bianca", 10);
        System.out.println(bianca.present());
        System.out.println(bianca.move());
        System.out.println(bianca.climbsOnRoof());
        System.out.println(bianca.move());
        System.out.println(bianca.move());

        Dog medor = new Dog("Medor", 8);
        System.out.println(medor.present());
        System.out.println(medor.move());
    }
}
