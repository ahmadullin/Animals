package org.example;

import java.util.Scanner;

public class Plate {
    private int food;

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        checkFood(food);
    }

    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("Осталось еды в миске: " + food);
    }

    public int addFood() {

        Scanner input = new Scanner(System.in);
        System.out.print("Добавить еды? (да=0/нет=любое значение) --> ");
        Integer res = input.nextInt();

        int num = 0;
        if (res == 0) {
            System.out.print("Сколько добавить?(Введите целое значение) --> ");
            num = input.nextInt();
            while ((num % 2 == 0)){
                System.out.print("Сколько добавить?(Введите целое значение) --> ");
                num = input.nextInt();
            }
        }
        else {
            System.out.println("Окей ");
        }
        return num;
    }

    private int checkFood(int eatFood) {
        if (eatFood < 0) {
            food = food + addFood();
            return food;
        } else {
            return food = eatFood;
        }
    }
}
