package FabricMethod;

public class CatsFabric implements AnimalFabric {
    @Override
    public Animal createNewAnimal() {
        return new Cat();
    }
}
