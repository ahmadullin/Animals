package org.example;

public class Cat {
    private String name;
    private int appetite;

    public int getAppetite() {
        return appetite;
    }

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }
    public void eat(int appetite, int food) {
        if (food >= appetite) {
            this.appetite = 0;
        }
        else {
            this.appetite = appetite;
        }
    }
     public void satiety(int appetite){
        if (appetite == 0){
            System.out.println(name + ": Покушал" + "(" + appetite + ")");
        }
         else {
             System.out.println(name + ": Голодный" + "(" + appetite + ")");
        }
     }
}

