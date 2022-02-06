package Builder;

public abstract class AnimalBuilder {
    Animal animal;

    public void createAnimal() {
        animal = new Animal();
    }

    abstract void setHead();
    abstract void setBody();
    abstract void setTail();

    Animal getAnimal() {
        return animal;
    }
}
