package Adapter;

public class AdapterDemo {
    public static void main(String[] args) {
        Target target = new AdapterToTarget(new SpecialClass());
        target.someMethod();
    }
}
