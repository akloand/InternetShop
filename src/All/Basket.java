package All;

public class Basket {
    private String items = "";
    private int totalPrice = 0;
    private int limit;
    private int count;
    private double totalWeight = 0;

    public Basket() {
        items = "Список товаров: ";
        this.limit = 100000;
    }

    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public Basket(String items, int totalPrice, int count, double totalWeight) {
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
        this.count = count;
        this.totalWeight = totalWeight;
    }

    public void add(String name, int price) {

        add(name, price, 1,0.1);
    }

    public void add(String name, int price, int count, double weight) {
        if (contains(name)) {
            return;
        }
        if (totalPrice + price > limit) {
            return;
        }

        items = items + "\n" + name + " - " + count + " шт. - " + price+" руб.";
        totalWeight = totalWeight + count * weight;
        totalPrice = totalPrice + count * price;
    }


    public void clear() {
        items = "";
        totalPrice = 0;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public double getTotalWeight() {
        return totalWeight;
    }
    public boolean contains(String name) {
        return items.contains(name);
    }


    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);

        }
    }
}
