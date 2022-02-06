package Decorator;

public class PeopleDecorator implements People {

    private People people;

    public PeopleDecorator(People people) {
        this.people = people;
    }


    @Override
    public String live() {
        return people.live();
    }
}
