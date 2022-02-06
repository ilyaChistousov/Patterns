package Decorator;

public class Person implements People {
    @Override
    public String live() {
       return "Person just lives.";
    }
}
