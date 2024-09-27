package day3;

class Animal {
    protected String name;
    protected int age;

    Animal(String n, int a) {
        this.name = n;
        this.age = a;
    }

    public String present() {
        String adj = "";

        if (this.isMajor()) {
            adj = " âgé";
        }

        return "Je suis un animal"+adj+" et j'ai "+this.age+" ans.";
    }

    public String move() {
        return this.name + " se déplace";
    }

    public boolean isMajor() {
        return this.age > 9;
    }

    public int getAge() {
        return this.age;
    }
}
