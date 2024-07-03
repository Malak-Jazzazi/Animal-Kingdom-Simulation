package model;

public class Shark extends Fish implements ICarnivore{
    private final int teethCount;

    public Shark(String name, int age, String species, WaterType waterType, int finCount, int teethCount) {
        super(name, age, species, waterType, finCount);
        this.teethCount = teethCount;
    }

    public int getTeethCount() {
        return teethCount;
    }

    @Override
    public void makeSound() {
        System.out.println("wop - wop");
    }

    @Override
    public void hunt() {
        System.out.println("Shark" + getName() + "eats meat only");
    }
}
