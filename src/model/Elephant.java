package model;

public class Elephant extends Mammal implements IHerbivore{
    private final int trunkLength;

    public Elephant(String name, int age, String species, String furColor, boolean isWarmBlooded, int prideSize) {
        super(name, age, species, furColor, isWarmBlooded);
        this.trunkLength = prideSize;
    }

    public int getTrunkLength() {
        return trunkLength;
    }

    @Override
    public void makeSound() {
        System.out.println("Fee - fee");
    }

    @Override
    public void graze() {
        System.out.println("Elephant" + getName() + "eats herbs only");
    }
}
