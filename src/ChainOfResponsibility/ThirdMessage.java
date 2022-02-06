package ChainOfResponsibility;

public class ThirdMessage extends Message{
    @Override
    void printMessage(String message) {
        System.out.println("Third message " + message);
    }
}
