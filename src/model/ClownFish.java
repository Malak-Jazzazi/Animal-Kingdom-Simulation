package model;

public class ClownFish extends Fish implements IOmnivore{
    private final int anemoneHost;

    public ClownFish(String name, int age, String species, WaterType waterType, int finCount, int teethCount) {
        super(name, age, species, waterType, finCount);
        this.anemoneHost = teethCount;
    }

    public int getAnemoneHost() {
        return anemoneHost;
    }

    @Override
    public void forage() {
        System.out.println("Clown fish" + getName() + "eats meat and herbs");
    }
}
