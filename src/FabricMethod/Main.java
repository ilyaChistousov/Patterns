package FabricMethod;

public class Main {
    public static void main(String[] args) {
        AnimalFabric animalFabric = createAnimal("CAT");
        Animal animal = animalFabric.createNewAnimal();

        animal.say();
    }

    public static AnimalFabric createAnimal(String type) {
        if(type.equalsIgnoreCase("cat")) {
            return new CatsFabric();
        } else if(type.equalsIgnoreCase("dog")) {
            return new DogsFabric();
        } else {
            throw new RuntimeException("wrong type of animal");
        }
    }
}
