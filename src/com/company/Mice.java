package com.company;

public class Mice extends Animal{
    private static int number = 0;

    public Mice(String food) {
        super.name = "mice";
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
