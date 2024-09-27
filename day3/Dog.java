package day3;

final class Dog extends Animal {
    Dog(String n, int a) {
        super(n, a * 7);
    }

    public String present() {
        System.out.println(super.isMajor()); // Celui de Animal
        System.out.println(this.isMajor()); // Celui de Dog (ou Animal si on ne l'a pas définit ici)

        return super.present().replace("animal", "chien");
    }

    public String move() {
        return super.move()+" dans sa niche.";
    }

    public boolean isMajor() {
        System.out.println(this.getAge()); // 8
        System.out.println(super.getAge()); // 56

        return this.age > 9 * 7;
    }

    public int getAge() {
        return super.getAge() / 7;
    }
}
