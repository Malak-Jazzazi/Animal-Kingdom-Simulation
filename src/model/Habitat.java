package model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Habitat {
    private final String type;
    private final int temperature;
    private final List<Animal> inhabitants;

    public Habitat(String type, int temperature) {
        this.type = type;
        this.temperature = temperature;
        this.inhabitants = new ArrayList<>();
    }

    public String getType() {
        return type;
    }

    public int getTemperature() {
        return temperature;
    }

    public List<Animal> getInhabitants() {
        return inhabitants;
    }

    public void addInhabitant(Animal animal){
        inhabitants.add(animal);
        System.out.println("Animal " + animal.getName() + " was added to habitat " + getType() );
    }

    public void removeInhabitant(Animal animal){
        boolean isRemoved = inhabitants.remove(animal);
        if(isRemoved){
            System.out.println("Animal " + animal.getName() + " was removed from habitat " + getType() );
        }else{
            System.out.println("Animal " + animal.getName() + "was not found in habitat" + getType());
        }
    }

    public List<String> listInhabitants(){
        List<String> inhabitantsNames = inhabitants.stream().map(Animal::getName).toList();
        System.out.println("Inhabitants Names");
        inhabitants.forEach(name -> System.out.print(name + " "));
        return inhabitantsNames;
    }

}
