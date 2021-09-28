package com.company;

public class Hamster extends Animal{
    private static int number = 0;

    public Hamster(String food) {
        super.name = "hamster";
        super.type = "rodent";
        super.typeOfFood = food;
        number++;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", typeOfFood='" + typeOfFood + '\'' +
                ", name='" + name + '\'' +
                ", number=" + number +
                '}';
    }

    @Override
    public int getNumber() {
        return number;
    }
}
