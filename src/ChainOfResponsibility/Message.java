package ChainOfResponsibility;

public abstract class Message {
    private Message nextMessage;

    public void setNextMessage(Message nextMessage) {
        this.nextMessage = nextMessage;
    }

    public void print(String message) {
        printMessage(message);
        if(nextMessage!= null) {
            nextMessage.print(message);
        }
    }

    abstract void printMessage(String message);

}
