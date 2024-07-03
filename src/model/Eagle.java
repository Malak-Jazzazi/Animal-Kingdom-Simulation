package model;

public class Eagle extends Bird implements ICarnivore{
    private final int flightAltitude;

    public Eagle(String name, int age, String species, int wingSpan, boolean canFly, int flightAltitude) {
        super(name, age, species, wingSpan, canFly);
        this.flightAltitude = flightAltitude;
    }

    public int getFlightAltitude() {
        return flightAltitude;
    }

    @Override
    public void makeSound() {
        System.out.println("aww - aww");
    }

    @Override
    public void hunt() {
        System.out.println("Eagle" + getName() + "eats meat only");
    }
}
