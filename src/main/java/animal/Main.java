package animal;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("Lion", AnimalSize.SMALL);

        System.out.println(animal);
        System.out.println(animal.getSound());
    }
}