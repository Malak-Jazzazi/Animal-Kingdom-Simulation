package model;

public class Penguin extends Bird implements ICarnivore{
    private final int swimSpeed;

    public Penguin(String name, int age, String species, int wingSpan, boolean canFly, int flightAltitude) {
        super(name, age, species, wingSpan, canFly);
        this.swimSpeed = flightAltitude;
    }

    public int getSwimSpeed() {
        return swimSpeed;
    }

    @Override
    public void makeSound() {
        super.makeSound();
    }

    @Override
    public void hunt() {
        System.out.println("Penguin" + getName() + "eats meat only");
    }
}
