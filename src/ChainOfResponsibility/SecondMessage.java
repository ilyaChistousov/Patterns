package ChainOfResponsibility;

public class SecondMessage extends Message{
    @Override
    void printMessage(String message) {
        System.out.println("Second message " + message);
    }
}
