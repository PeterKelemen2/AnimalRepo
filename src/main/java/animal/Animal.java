package animal;

public class Animal {
    private String name;
    private AnimalSize size;

    public Animal(String name, AnimalSize size) {
        this.name = name;
        this.size = size;

        if (size == AnimalSize.MEDIUM) {
            System.out.println("Animal is medium size");
        }

        if (name.equals("newName")) {
            System.out.println(name);
        }
    }
}
