package interfaces;

public class App {
    public static void main(String[] args) {
        Cat bianca = new Cat("Bianca");
        Cat mina = new Cat("Mina");
        Human fiorella = new Human("Fiorella", "Mota");

        bianca.move(mina);
        mina.move(fiorella);
        fiorella.move(bianca);
    }
}
