package model;

public class Mammal extends Animal{

    private final String furColor;
    private final boolean isWarmBlooded;

    public Mammal(String name, int age, String species, String furColor, boolean isWarmBlooded) {
        super(name, age, species);
        this.furColor = furColor;
        this.isWarmBlooded = isWarmBlooded;
    }

    public String getFurColor() {
        return furColor;
    }

    public boolean isWarmBlooded() {
        return isWarmBlooded;
    }

    public void giveBirth(){
        System.out.println("Mammal " + this.getName() + " have give birth");
    }

    @Override
    public void makeSound() {
        System.out.println("roww - roww");
    }
}
