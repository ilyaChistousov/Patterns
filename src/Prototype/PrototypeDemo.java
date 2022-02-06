package Prototype;

public class PrototypeDemo {
    public static void main(String[] args) {
        Person person = new Person(1, "name1", 13);
        System.out.println(person);

        PersonFactory factory = new PersonFactory();
        factory.setPerson(person);
        Person clone = factory.copyPerson();
        System.out.println(clone);
    }
}
