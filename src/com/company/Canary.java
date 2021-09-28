package com.company;

public class Canary extends Animal{

    private static int number = 0;

    public Canary(String food) {
        super.name = "canary";
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
