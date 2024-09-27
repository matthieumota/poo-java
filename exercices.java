class App {
    public static void main(String[] args) {
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

        CalculatorAdvanced c = new CalculatorAdvanced();
        c.add(1).add(3).add(4).add(5); // 13
        System.out.print(c.getResult());
        c.substract(10).add(2);  // 5
        System.out.print(c.getResult());
        c.multiply(3); // 3
        c.divide(0);
        System.out.print(c.getResult());
        // c.result = 153;
        c.toggle(); // ouvre ou ferme la calculette
        System.out.print(c.isOpened());
        //c.add(10).substract(4);
        //c.multiply(2).divide(4);
        //c.result(); // 3
    }
}
