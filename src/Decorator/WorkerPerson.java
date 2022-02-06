package Decorator;

public class WorkerPerson extends PeopleDecorator {

    public WorkerPerson(People people) {
        super(people);
    }

    public String work() {
        return " Worker person working.";
    }

    @Override
    public String live() {
        return super.live() + work();
    }
}
