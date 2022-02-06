package ChainOfResponsibility;

public class FirstMessage extends Message{

    @Override
    void printMessage(String message) {
        System.out.println("First message " + message);
    }
}
