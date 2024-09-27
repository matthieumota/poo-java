package interfaces;

abstract class Animal implements Living {
    abstract public String getName();
    // abstract public String getAge(); // Remplace le rôle de l'interface...

    public void move() {
        System.out.println(this.getName() + " se déplace.");
    }

    public void move(Living other) {
        System.out.println(this.getName() + " se déplace avec " + other.getName());
    }

    public void breathe() {
        System.out.println(this.getName() + " respire.");
    }
}

class Dog extends Animal {
    @Override
    public String getName() {
        return "Medor";
    }
}
