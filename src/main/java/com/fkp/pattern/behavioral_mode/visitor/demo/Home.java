package com.fkp.pattern.behavioral_mode.visitor.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * 结构对象角色，主人家
 */
public class Home {
    private final List<Animal> animalList;

    public Home() {
        this.animalList = new ArrayList<>();
    }

    public void addAnimal(Animal animal){
        animalList.add(animal);
    }

    public void action(Person person){
        for (Animal animal : animalList) {
            animal.accept(person);
        }
    }

}
