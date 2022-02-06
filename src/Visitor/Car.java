package Visitor;

public class Car implements Element {
    private final Element[] elements;

    public Car() {
        elements = new Element[] {
                new BodyElement(),
                new EngineElement()
        };
    }

    @Override
    public void accept(Visitor visitor) {
        for(Element element : elements) {
            element.accept(visitor);
        }
    }

}
