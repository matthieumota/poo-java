void main() {
    Car ferrari = new Car("Ferrari", "360", 1998, 50000, "rouge");
    Car porsche = new Car("Porsche", "911");

    System.out.println(ferrari.present());
    System.out.println(porsche.present());

    porsche.drive();
    porsche.klaxon();

    Rectangle monRectangle = new Rectangle(10, 20);
    Rectangle monAutreRectangle = new Rectangle(10, 5);
    System.out.println(monRectangle.area());
    System.out.println(monRectangle.perimeter());
    System.out.println(monRectangle.isValid());

    Square monCarre = new Square(10);
    System.out.println(monCarre.area());
    System.out.println(monCarre.perimeter());
    System.out.println(monCarre.isValid());
    System.out.println(
        monCarre.isBiggerThan(monRectangle)
    );
    System.out.println(monCarre.isBiggerThan(monAutreRectangle));
}
