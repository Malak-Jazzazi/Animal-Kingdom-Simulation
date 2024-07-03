package model;

public class Food {
    private String name;
    private int nutritionValue;

    public Food(String name, int nutritionValue) {
        this.name = name;
        this.nutritionValue = nutritionValue;
    }

    public String getName() {
        return name;
    }

    public int getNutritionValue() {
        return nutritionValue;
    }

    public void consume(Animal animal){
        System.out.println("Animal " + animal.getName() + "is Eating " + name);
    }
}
