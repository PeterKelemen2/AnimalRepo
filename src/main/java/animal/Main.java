package animal;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("Lion", AnimalSize.SMALL);
        animal.setName("Lion");

        System.out.println(animal);

        Dog dog = new Dog("Buksi", AnimalSize.MEDIUM);
        System.out.println(dog);
        dog.fetch();

    }
}