package Models.PackAnimals;

import Models.PackAnimal;

import java.util.ArrayList;
import java.util.List;

public class Donkey extends PackAnimal {
    private int donkeyId;
    private String name;
    private int age;
    private static List<String> listOfCommands;

    public Donkey(String name, int age) {
        this.name = name;
        this.age = age;
        listOfCommands = new ArrayList<>();
    }

    public int getDonkeyId() {
        return donkeyId;
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
        return "Donkey{" +
                "donkeyId=" + donkeyId +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
