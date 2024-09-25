void main() {
    Car ferrari = new Car("Ferrari", "360", 1998, 50000, "rouge");
    Car porsche = new Car("Porsche", "911");

    System.out.println(ferrari.present());
    System.out.println(porsche.present());

    porsche.drive();
    porsche.klaxon();

    Rectangle r = new Rectangle(10, 20);
    System.out.println(r.area());
    System.out.println(r.perimeter());
    System.out.println(r.isValid());

    Square s = new Square(10);
    System.out.println(s.area());
    System.out.println(s.perimeter());
    System.out.println(s.isValid());
    System.out.println(s.isBiggerThan(r));
}
