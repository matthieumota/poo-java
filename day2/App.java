package day2;

import java.time.LocalDate;

class App {
    public static void main(String[] args) {
        Cat garfield = new Cat("Garfield", LocalDate.of(2004, 9, 27));
        Cat bianca = new Cat("Bianca", LocalDate.of(2014, 9, 27));
        Cat mina = new Cat("Mina", LocalDate.of(2016, 9, 27));
        Address maison = new Address("Hulluch");

        garfield.addFriend(mina).addFriend(bianca);
        System.out.println(garfield.getFriends());

        garfield.setName("Toto")
            .setAddress(maison);
        System.out.println(garfield.getName());
        System.out.println(garfield.getBirthday());
        System.out.println(garfield.age());
        System.out.println(garfield.getAddress().getCity());
        System.out.println(garfield);
    }
}
