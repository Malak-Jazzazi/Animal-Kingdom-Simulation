package model;

public class Veterinarian {
    private String name;
    private String specialty;

    public Veterinarian(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
    }

    public String getName() {
        return name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void checkAnimal(Animal animal){
        System.out.println("Veterinarian" + name + " is checking " + animal.getName() + " health");
    }

    public void treatAnimal(Animal animal){
        System.out.println("Veterinarian" + name + " is treating " + animal.getName());
    }
}
