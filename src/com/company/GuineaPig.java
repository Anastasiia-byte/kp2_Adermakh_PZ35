package com.company;

public class GuineaPig extends Animal{
    private static int number = 0;

    public GuineaPig(String food) {
        super.name = "guinea pig";
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
