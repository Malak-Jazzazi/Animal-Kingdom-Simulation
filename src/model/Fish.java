package model;

public class Fish extends Animal{

    private final WaterType waterType;
    private final int finCount;

    public Fish(String name, int age, String species, WaterType waterType, int finCount) {
        super(name, age, species);
        this.waterType = waterType;
        this.finCount = finCount;
    }

    public WaterType getWaterType() {
        return waterType;
    }

    public int getFinCount() {
        return finCount;
    }

    public void swim(){
        System.out.println("Fish " + this.getName() + " is swimming");
    }

    @Override
    public void makeSound() {
        System.out.println("bo - bo");
    }
}
