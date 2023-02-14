package Models.Pets;

import Models.Pet;

import java.util.ArrayList;
import java.util.List;

public class Dog extends Pet {
    private int dogId;
    private String name;
    private int age;
    private static List<String> listOfCommands;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
        listOfCommands = new ArrayList<>();
    }

    public int getDogId() {
        return dogId;
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
        return "Dog{" +
                "dogId=" + dogId +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
