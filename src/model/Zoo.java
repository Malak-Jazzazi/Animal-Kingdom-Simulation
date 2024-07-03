package model;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private String name;
    private String location ;
    private List<Animal> animals;

    public Zoo(String name, String location) {
        this.name = name;
        this.location = location;
        this.animals = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void addAnimal(Animal animal){
        animals.add(animal);
        System.out.println("Animal " + animal.getName() + " was added to zoo " + getName() );

    }

    public void removeAnimal(Animal animal){
        boolean isRemoved = animals.remove(animal);
        if(isRemoved){
            System.out.println("Animal " + animal.getName() + " was removed from zoo " + getName() );
        }else{
            System.out.println("Animal " + animal.getName() + "was not found in zoo" + getName());
        }
    }

    public void feedAnimal(Animal animal , Food food){
        food.consume(animal);
    }
}
