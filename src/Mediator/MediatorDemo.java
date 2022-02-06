package Mediator;

public class MediatorDemo {
    public static void main(String[] args) {
        SimpleChat chat = new SimpleChat();
        User admin = new Admin(chat);
        User user1 = new SimpleUser(chat);
        User user2 = new SimpleUser(chat);

        chat.setAdmin(admin);
        chat.addUser(user1);
        chat.addUser(user2);

        user1.sendMessage("newMessage from User1");

    }
}
