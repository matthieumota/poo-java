package day2;

import java.time.LocalDate;

class App {
    public static void main(String[] args) {
        Cat garfield = new Cat("Garfield", LocalDate.of(2004, 9, 27));
        Address maison = new Address("Hulluch");

        garfield.setName("Toto")
            .setAddress(maison);
        System.out.println(garfield.getName());
        System.out.println(garfield.getBirthday());
        System.out.println(garfield.age());
        System.out.println(garfield.getAddress().getCity());
        System.out.println(garfield);
    }
}
