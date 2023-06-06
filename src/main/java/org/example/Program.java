package org.example;

public class Program {
    public static void main(String[] args) {
        Cat cat = new Cat("Кот", 5);

        Plate plate = new Plate(2);
        plate.info();

        int var = cat.getAppetite();

        cat.eat(cat.getAppetite(), plate.getFood());
        cat.satiety(cat.getAppetite());
        plate.setFood(plate.getFood() - var);
        plate.info();
        System.out.println();
    }
}
