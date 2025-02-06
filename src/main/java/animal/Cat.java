package animal;

public class Cat extends Animal {
    public Cat(String name, AnimalSize size) {
        super(name, size);
    }

    public void purr() {
        System.out.println(getName() + " is purring!");
    }
}
