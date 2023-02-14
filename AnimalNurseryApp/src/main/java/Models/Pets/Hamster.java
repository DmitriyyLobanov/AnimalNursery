package Models.Pets;

import Models.Pet;

import java.util.ArrayList;
import java.util.List;

public class Hamster extends Pet {
    private int hamsterId;
    private String name;
    private int age;
    private static List<String> listOfCommands;

    public Hamster(String name, int age) {
        this.name = name;
        this.age = age;
        listOfCommands = new ArrayList<>();
    }

    public int getHamsterId() {
        return hamsterId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static List<String> getListOfCommands() {
        return listOfCommands;
    }
    public void setNewCommand(String newCommand){
        listOfCommands.add(newCommand);
    }

    @Override
    public String toString() {
        return "Hamster{" +
                "hamsterId=" + hamsterId +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
