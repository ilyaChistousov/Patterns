package Singleton;

public class Connection {
    private static Connection connection;

    private Connection(){

    }

    public synchronized static Connection getConnection() {
        if(connection == null) {
            connection = new Connection();
        }
        return connection;
    }

    public synchronized void connecting() {
        System.out.println("Connections is established...");
    }
}
