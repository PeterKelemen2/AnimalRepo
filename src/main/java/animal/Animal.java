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

    @Override
    public String toString() {
        return this.getClass().getName() + " -  Name: " + name + ", Size: " + size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AnimalSize getSize() {
        return size;
    }

    public void setSize(AnimalSize size) {
        this.size = size;
    }
}
