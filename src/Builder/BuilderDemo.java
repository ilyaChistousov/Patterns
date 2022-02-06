package Builder;


public class BuilderDemo {
    public static void main(String[] args) {
        AnimalBuilder catBuilder = new CatBuilder();
        Director director = new Director(catBuilder);
        System.out.println(director.createAnimal());

        AnimalBuilder chimeraBuilder = new ChimeraBuilder();
        Director director1 = new Director(chimeraBuilder);
        System.out.println(director1.createAnimal());
    }
}
