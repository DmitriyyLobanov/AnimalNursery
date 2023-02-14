package Models.Pets;

import Models.Pet;

import java.util.ArrayList;
import java.util.List;

public class Cat extends Pet {

    private int catId;
    private String name;
    private int age;
    private static List<String> listOfCommands;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        listOfCommands = new ArrayList<>();
    }


    public int getCatId() {
        return catId;
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
        return "Cat{" +
                "catId=" + catId +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
