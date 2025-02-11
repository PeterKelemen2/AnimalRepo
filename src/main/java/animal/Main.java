package animal;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("Lion", AnimalSize.SMALL);
//        animal.setName("Lion");

//        System.out.println(animal);

        Dog dog = new Dog("Buksi", AnimalSize.MEDIUM);
//        System.out.println(dog);
        dog.fetch();

        Cat cat = new Cat("Cica", AnimalSize.SMALL);
        System.out.println(cat);
        cat.purr();

        ArrayList<Animal> animalList = new ArrayList<>();
        animalList.add(animal);
        animalList.add(cat);
        animalList.add(dog);

        for (Animal a : animalList) {
            System.out.println(a);

            if (a instanceof Cat) {
                ((Cat) a).purr();
            } else if (a instanceof Dog) {
                ((Dog) a).fetch();
            }
        }

        int num = 12;
        System.out.println(num);
        System.out.println((double) num);

        jsonWriteAnimalListToFile(animalList, "resources/data.json");
    }

    private static void jsonWriteAnimalListToFile(ArrayList<Animal> list, String outputPath) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String jsonString = gson.toJson(list);

        File file = new File(outputPath);
        file.getParentFile().mkdirs();

        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write(jsonString);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}