class App {
    void main(String[] args) {
        Cat bianca = new Cat();
        bianca.name = "Bianca";
        bianca.age = 10;
        Cat mina = new Cat("Mina", 5, 1);
        // mina.name = "Mina";

        System.out.println(mina.name+" a "+mina.age+" ans.");
        // System.out.print(mina);
        // System.out.print(bianca);

        bianca = null;
        mina = null;
        System.gc();

        System.out.println(bianca.cry());
        System.out.println(mina.cry());
        System.out.println(bianca.cry("manger"));
        System.out.println(bianca.cry(mina));
    }
}

class Cat {
    String name;
    int age;

    Cat(String n, int a, int factor) {
        this.name = n;
        this.age = a * factor;
    }

    Cat() {}

    protected void finalize() {
        System.out.println("On verra ceci si le garbage collector fait son travail");
    }

    String cry() {
        // System.out.print(this);
        return this.name + " fait Miaou !";
    }

    String cry(String word) {
        return this.name + " dit " + word + " !";
    }

    String cry(Cat other) {
        return this.name + " salue " + other.name;
    }
}
