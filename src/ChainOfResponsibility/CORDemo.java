package ChainOfResponsibility;

public class CORDemo {
    public static void main(String[] args) {
        Message message = new FirstMessage();
        Message message1 = new SecondMessage();
        Message message2 = new ThirdMessage();

        message.setNextMessage(message1);
        message1.setNextMessage(message2);

        message.print("new Message");


    }
}
