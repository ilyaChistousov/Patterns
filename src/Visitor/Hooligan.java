package Visitor;

public class Hooligan implements Visitor {

    @Override
    public void visit(EngineElement element) {
        System.out.println("Break the engine");
    }

    @Override
    public void visit(BodyElement element) {
        System.out.println("Scratched the body");
    }
}
