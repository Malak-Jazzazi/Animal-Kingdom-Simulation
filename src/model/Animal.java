package model;

public abstract class Animal {
    private final String name;
    private final int age;
    private final String species;

    public Animal(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSpecies() {
        return species;
    }

    public void eat(){
        System.out.println("Animal " + name + "is Eating");
    }

    public void sleep(){
        System.out.println("Animal " + name + "is Sleeping");
    }

    public void move(){
        System.out.println("Animal " + name + "is Moving");
    }

    public abstract void makeSound();
}
