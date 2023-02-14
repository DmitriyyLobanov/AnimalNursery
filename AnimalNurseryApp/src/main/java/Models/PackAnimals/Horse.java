package Models.PackAnimals;

import Models.PackAnimal;

import java.util.ArrayList;
import java.util.List;

public class Horse extends PackAnimal {

    private int horseId;
    private String name;
    private int age;
    private static List<String> listOfCommands;

    public Horse(String name, int age) {
        this.name = name;
        this.age = age;
        listOfCommands = new ArrayList<>();
    }

    public int getHorseId() {
        return horseId;
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
        return "Horse{" +
                "horseId=" + horseId +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
