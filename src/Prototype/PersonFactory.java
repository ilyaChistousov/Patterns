package Prototype;

public class PersonFactory {
    private Person person;

    public void setPerson(Person person) {
        this.person = person;
    }

    public Person copyPerson() {
        return (Person) person.copy();
    }
}
