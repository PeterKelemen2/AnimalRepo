package animal;

public class Animal {
    private String name;
    private AnimalSize size;
    private AnimalSound sound;

    public Animal(String name, AnimalSize size) {
        this.name = name;
        this.size = size;

        switch (size) {
            case SMALL:
                this.sound = AnimalSound.CHIRP;
                break;
            case MEDIUM:
                this.sound = AnimalSound.BARK;
                break;
            case LARGE:
                this.sound = AnimalSound.ROAR;
                break;
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
        if (!name.equals(this.name)) {
            this.name = name;
            System.out.println("Name set!");
        } else {
            System.out.println("Name not set!");
        }
    }

    public AnimalSize getSize() {
        return size;
    }

    public void setSize(AnimalSize size) {
        if (this.size != size) {
            this.size = size;
        }
    }

    public AnimalSound getSound() {
        return sound;
    }

    public void setSound(AnimalSound sound) {
        if (this.sound != sound) {
            this.sound = sound;
        }
    }
}
