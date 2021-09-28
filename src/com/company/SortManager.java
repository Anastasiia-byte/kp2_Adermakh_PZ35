package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortManager {

    private List<Animal> animals;

    public SortManager(List<Animal> animals){
        this.animals = animals;
    }


    public List<Animal> sortByNumber(boolean check){

        List<Animal> result = new ArrayList<>(animals);
        if(check){
            NumberComparator comparator = new NumberComparator();
            result.sort(comparator.reversed());
            return result;
        }
        result.sort(new NumberComparator());
        return result;
    }

    public List<Animal> sortByFood(boolean check){
        FoodComparator comparator = new FoodComparator();
        List<Animal> result = new ArrayList<>(animals);
        if(check){
            result.sort(Collections.reverseOrder(comparator));
            return result;
        }
        result.sort(comparator);
        return result;
    }

    public List<Animal> sortByNameFood(boolean check){
        List<Animal> result = new ArrayList<>(animals);

        Comparator<Animal> nameFoodComparator = new Comparator<Animal>() {
            @Override
            public int compare(Animal o1, Animal o2) {
                int res = o1.getTypeOfFood().compareTo(o2.getTypeOfFood());
                if(res == 0){
                    res = o1.getName().compareTo(o1.getName());
                }
                return res;
            }
        };

        if (check){
            result.sort(Collections.reverseOrder(nameFoodComparator));
            return result;
        }

        result.sort(nameFoodComparator);
        return result;

    }

    public List<Animal> sortByName(boolean check){
        List<Animal> result = new ArrayList<>(animals);

        Comparator<Animal> nameComparator = (o1, o2) -> o1.getName().compareTo(o2.getName());

        if (check){
            result.sort(Collections.reverseOrder(nameComparator));
            return result;
        }

        result.sort(nameComparator);
        return result;
    }

    private static class NumberComparator implements Comparator<Animal>{

        @Override
        public int compare(Animal o1, Animal o2) {
            int res = Integer.compare(o1.getNumber(), o2.getNumber());
            return res;
        }
    }

    private class FoodComparator implements Comparator<Animal>{

        @Override
        public int compare(Animal o1, Animal o2) {
            return o1.getTypeOfFood().compareTo(o2.getTypeOfFood());
        }

    }

}
