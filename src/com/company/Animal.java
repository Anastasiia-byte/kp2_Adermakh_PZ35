package com.company;

public abstract class Animal {
    protected String type;
    protected String typeOfFood;
    protected String name;

    public String getType() {
        return type;
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public String getName(){
        return name;
    }

    public abstract String toString();

    public abstract int getNumber();
}
