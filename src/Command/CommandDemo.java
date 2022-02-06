package Command;

public class CommandDemo {
    public static void main(String[] args) {
        Computer computer = new Computer();
        User user = new User(computer);
        user.start();
        user.reset();
        user.stop();
    }
}
