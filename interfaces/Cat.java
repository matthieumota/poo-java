package interfaces;

class Cat implements Living {
    private String name;

    Cat(String n) {
        this.name = n;
    }

    @Override
	public String getName() {
        return this.name;
	}

    @Override
    public void move() {
        System.out.println(this.name+" se déplace silencieusement");
    }

    @Override
    public void move(Living other) {
        this.move();
        System.out.println("avec "+other.getName());
    }

    @Override
    public void breathe() {
        System.out.println(this.name+" respire par son museau");
    }
}
