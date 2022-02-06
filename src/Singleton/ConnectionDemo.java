package Singleton;

public class ConnectionDemo {
    public static void main(String[] args) {
        Connection connection = Connection.getConnection();
        connection.connecting();
    }
}
