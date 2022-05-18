package Shop;

import java.util.Objects;

public class Product {
    private final int price;
    private final String name;
    private int barCode;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public Product setPrice(int price) {
        return new Product(name, price);
    }

    public String getName() {
        return name;
    }

    public Product setName(String name) {
        return new Product(name, price);
    }

    public String toString() {
        return name + " + " + price;
    }

    public void print() {
        String info = name + " - " + price;
        System.out.println(info);

    }
}
