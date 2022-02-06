package Composite;

import java.util.ArrayList;
import java.util.List;

public class SubOrder implements Order {

    private int price = 0;

    private List<Order> orders = new ArrayList<>();


    public void setOrders(Order order) {
        orders.add(order);
    }


    @Override
    public int getPrice() {
         for(Order order : orders) {
             price+= order.getPrice();
         }
         return price;
    }
}
