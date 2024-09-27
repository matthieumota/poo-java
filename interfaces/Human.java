package interfaces;

class Human implements Living {
    private String firstName;
    private String lastName;

    Human(String f, String l) {
        this.firstName = f;
        this.lastName = l;
    }

    @Override
    public String getName() {
        return this.firstName + " " + this.lastName;
    }

    @Override
    public void move() {
        System.out.println(this.getName() + " marche.");
    }

    @Override
    public void move(Living other) {
        this.move();
        System.out.println("avec "+other.getName());
    }

    @Override
    public void breathe() {
        System.out.println(this.getName() + " respire.");
    }
}
