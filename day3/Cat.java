package day3;

final class Cat extends Animal {
    private int lifes = 9;

    Cat(String n, int a) {
        super(n, a * 4);
    }

    public String present() {
        return super.present().replace("animal", "chat");
    }

    public String move() {
        return super.move()+" silencieusement avec ses "+this.lifes+" vies.";
    }
    
    public String climbsOnRoof() {
        this.lifes--;
        return this.name + " est sur le toit.";
    }
}
