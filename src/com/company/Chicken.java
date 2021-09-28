package com.company;

public class Chicken extends Animal{
    private static int number;

    public Chicken(String food) {
        super.name = "chicken";
        super.type = "domestic";
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
