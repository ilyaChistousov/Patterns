package Composite;

public class Product implements Order {

    private final int price;

    public Product(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

}
