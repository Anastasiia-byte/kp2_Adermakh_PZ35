package com.company;

import java.util.ArrayList;
import java.util.List;

public class SearchManager {

    private List<Animal> animals;

    public SearchManager(List<Animal> animals){
        this.animals = animals;
    }

    public List<Animal> findByType(String type){
        List<Animal> result = new ArrayList<>();
        for(Animal animal : animals){
            if (type.equals(animal.getType())){
                result.add(animal);
            }
        }
        return result;
    }
}
