public class Main {


    public static void main(String[] args) {

        Basket basket1 = new Basket();
        Basket basket2 = new Basket();

        basket1.add("колбаса", 70);
        basket1.add("масло", 60);
        basket1.add("молоко", 30);
        basket1.print("\nСодержимое корзины");
        System.out.println("Стоимость всех товаров Васи: " + basket1.getTotalPrice());


        basket2.add("пылесос", 7000);
        basket2.add("изолента", 70);
        basket2.print("\nСодержимое корзины");
        System.out.println("Стоимость всех товаров Пети: " + basket2.getTotalPrice());


//        basket1.clear();
//        System.out.println();
//        basket1.print("Содержимое корзины");
//        totalPrice = basket1.getTotalPrice();
//        System.out.println("Стоимость всех товаров: " + totalPrice);
    }
}
