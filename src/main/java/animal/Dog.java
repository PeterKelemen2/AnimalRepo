package animal;

public class Dog extends Animal {
    public Dog(String name, AnimalSize size) {
        super(name, size);
    }

    public void fetch() {
        System.out.println(getName() + " is fetching!");
    }
}
