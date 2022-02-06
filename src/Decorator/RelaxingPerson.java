package Decorator;

public class RelaxingPerson extends PeopleDecorator{
    public RelaxingPerson(People people) {
        super(people);
    }

    public String relax() {
       return "Relaxing person just relaxing";
    }

    @Override
    public String live() {
        return super.live() + relax();
    }
}
