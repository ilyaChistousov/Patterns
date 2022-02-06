package Adapter;

public class AdapterToTarget extends Target {

    private SpecialClass specialClass;

    public AdapterToTarget(SpecialClass specialClass) {
        this.specialClass = specialClass;
    }

    @Override
    public void someMethod() {
        specialClass.specialMethod();
    }
}
