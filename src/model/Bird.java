package model;

public class Bird extends Animal{

    private final int wingSpan;
    private final boolean canFly;

    public Bird(String name, int age, String species, int wingSpan, boolean canFly) {
        super(name, age, species);
        this.wingSpan = wingSpan;
        this.canFly = canFly;
    }

    public int getWingSpan() {
        return wingSpan;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void layEggs(){
        System.out.println("Bird " + this.getName() + " have lay eggs");
    }

    @Override
    public void makeSound() {
        System.out.println("wack - wack");
    }
}
