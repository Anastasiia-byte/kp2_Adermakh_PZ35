package com.company;

public class Parrot extends Animal{
    private static int number = 0;

    public Parrot(String food) {
        super.name = "parrot";
        super.type = "bird";
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
