package Builder;

public class Director {

    AnimalBuilder builder;

    public Director(AnimalBuilder builder) {
        this.builder = builder;
    }

    public Animal createAnimal() {
        builder.createAnimal();
        builder.setHead();
        builder.setBody();
        builder.setTail();

        return builder.getAnimal();
    }
}
