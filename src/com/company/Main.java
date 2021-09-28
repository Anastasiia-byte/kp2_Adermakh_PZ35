package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<Animal> animalList = new ArrayList<>();
        initializeList(animalList);

        System.out.println("1 - bird; 2 - domestic; 3 - rodent");
        Scanner scanner = new Scanner(System.in);
        String choise = scanner.next();
        SearchManager searchManager = new SearchManager(animalList);

        switch (choise){
            case "1":
                animalList = searchManager.findByType("bird");
                break;
            case "2":
                animalList = searchManager.findByType("domestic");
                break;
            case "3":
                animalList = searchManager.findByType("rodent");
                break;
            default:
                return;
        }
        SortManager sortManager = new SortManager(animalList);

        List<Animal> tempResult = sortManager.sortByNumber(true);
        for (Animal r : tempResult){
            System.out.println(r);
        }
        System.out.println();
        tempResult = sortManager.sortByFood(true);
        for (Animal r : tempResult){
            System.out.println(r);
        }
        System.out.println();
        tempResult = sortManager.sortByNameFood(false);
        for (Animal r : tempResult){
            System.out.println(r);
        }
        System.out.println();
        tempResult = sortManager.sortByName(true);
        for (Animal r : tempResult){
            System.out.println(r);
        }

        scanner.close();


    }

    private static void initializeList(List<Animal> animals){
        for(int i = 0; i < 3; i++){
            animals.add(new Cat("meat"));
            animals.add(new Mice("all"));
            animals.add(new Parrot("corn"));
        }

        for (int i = 0; i < 2; i++){
            animals.add(new Dog("meat"));
            animals.add(new Hamster("oat"));
            animals.add(new Canary("worm"));
        }

        animals.add(new Chicken("millet"));
        animals.add(new GuineaPig("hay"));
    }
}
