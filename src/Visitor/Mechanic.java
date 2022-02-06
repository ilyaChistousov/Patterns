package Visitor;

public class Mechanic implements Visitor {

    @Override
    public void visit(EngineElement element) {
        System.out.println("Fixed engine");
    }

    @Override
    public void visit(BodyElement element) {
        System.out.println("Painted over the scratch");
    }
}
