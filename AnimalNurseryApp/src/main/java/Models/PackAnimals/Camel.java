package Models.PackAnimals;

import Models.PackAnimal;

import java.util.ArrayList;
import java.util.List;

public class Camel extends PackAnimal {
    private int camelId;
    private String name;
    private int age;
    private static List<String> listOfCommands;

    public Camel(String name, int age) {
        this.name = name;
        this.age = age;
        listOfCommands = new ArrayList<>();
    }

    public int getCamelId() {
        return camelId;
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
        return "Camel{" +
                "camelId=" + camelId +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
