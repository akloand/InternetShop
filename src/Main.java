public class Main {


    public static void main(String[] args) {

        Basket basket1 = new Basket();
        Basket basket2 = new Basket(5020);


        basket1.add("колбаса", 70);
        basket1.add("масло", 60);
        basket1.add("молоко", 30);
        basket1.print("\nСодержимое корзины");
        System.out.println("Стоимость всех товаров Васи: " + basket1.getTotalPrice());


        basket2.add("пылесос", 5000);
        basket2.add("изолента", 700);
        basket2.print("\nСодержимое корзины");
        System.out.println("Стоимость всех товаров Пети: " + basket2.getTotalPrice());

        Basket mashaBasket = new Basket();
        mashaBasket.add("Стол", 300, 2);
        mashaBasket.add("Хлеб", 30, 3);
        mashaBasket.add("Лук", 130, 5);
        mashaBasket.print("\nСодержимое корзины Маши: ");
        System.out.println("Стоимость всех товаров Маши: " + mashaBasket.getTotalPrice());

//        basket1.clear();
//        System.out.println();
//        basket1.print("Содержимое корзины");
//        totalPrice = basket1.getTotalPrice();
//        System.out.println("Стоимость всех товаров: " + totalPrice);
    }
}
