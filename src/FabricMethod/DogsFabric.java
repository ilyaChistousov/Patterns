package FabricMethod;

public class DogsFabric implements AnimalFabric {
    @Override
    public Animal createNewAnimal() {
        return new Dog();
    }
}
