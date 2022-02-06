package Composite;

public class CompositeDemo {
    public static void main(String[] args) {
        SubOrder mainSubOrder = new SubOrder();
        mainSubOrder.setOrders(new Product(100));
        mainSubOrder.setOrders(new Product(200));

        SubOrder subOrder1 = new SubOrder();
        subOrder1.setOrders(new Product(400 ));
        subOrder1.setOrders(new Product(1000));

        mainSubOrder.setOrders(subOrder1);

        System.out.println(mainSubOrder.getPrice());
    }
}
