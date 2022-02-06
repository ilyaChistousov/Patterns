package Proxy;


public class ProxyDemo {
    public static void main(String[] args) {
        Computer computer = new ProxyComputer();
        computer.run();
    }
}
