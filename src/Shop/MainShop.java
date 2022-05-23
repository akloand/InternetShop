package Shop;

import Shop.Order;
import Shop.Product;

public class MainShop {

    public static void main(String[] args) {
        Product product = new Product("milk", 60);
        Order order = new Order();
        order.addProduct(product);

        System.out.println(product.toString());


    }
}
