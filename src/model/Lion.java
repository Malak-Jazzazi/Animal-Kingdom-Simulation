package model;

public class Lion extends Mammal implements ICarnivore{
    private final int prideSize;

    public Lion(String name, int age, String species, String furColor, boolean isWarmBlooded, int prideSize) {
        super(name, age, species, furColor, isWarmBlooded);
        this.prideSize = prideSize;
    }

    public int getPrideSize() {
        return prideSize;
    }

    @Override
    public void makeSound() {
        super.makeSound();
    }

    @Override
    public void hunt() {
        System.out.println("Lion" + getName() + "eats meat only");
    }
}
