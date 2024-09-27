package day2;

import java.time.LocalDate;

class App {
    public static void main(String[] args) {
        Cat garfield = new Cat("Garfield", LocalDate.of(2004, 9, 27));
        Cat bianca = new Cat("Bianca", LocalDate.of(2014, 9, 27));
        Cat mina = new Cat("Mina", LocalDate.of(2016, 9, 27));
        Address maison = new Address("Hulluch");

        Cat titi = Cat.createWithAddress("Titi", "Paris", "2004-08-15");
        System.out.println(titi.getName());
        System.out.println(titi.getAddress().getCity());

        System.out.println(Cat.count);

        garfield.addFriend(mina).addFriend(bianca);

        for (int i = 0; i < garfield.getFriends().size(); i++) {
            System.out.println(garfield.getFriends().get(i).getName());
        }

        for (Cat friend : garfield.getFriends()) {
            System.out.println(friend.getName());
        }

        garfield.setName("Toto")
            .setAddress(maison);
        System.out.println(garfield.getName());
        System.out.println(garfield.getBirthday());
        System.out.println(garfield.age());
        System.out.println(garfield.getAddress().getCity());
        System.out.println(garfield);
    }
}
