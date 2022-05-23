package Shop;

import Shop.Basket;

public class MainBasket {


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

        Basket mashaBasket = new Basket(300);
        mashaBasket.add("Стол", 300, 2, 3.2);
        mashaBasket.add("Хлеб", 30, 3, 0.2);
        mashaBasket.add("Лук", 130, 5, 0.1);
        mashaBasket.print("\nСодержимое корзины Маши: ");
        System.out.println("Стоимость всех товаров Маши: " + mashaBasket.getTotalPrice() + " руб.");
        System.out.println("Вес всех товаров Маши: " + mashaBasket.getTotalWeight() + " кг");

        Basket romaBasket = new Basket("Картина", 100, 1, 2.2);
        romaBasket.print("\nСодержание корзины Ромы:");

        Basket jenyaBasket = new Basket("sdfsdf", 50, 3, 5.1);
        jenyaBasket.add("Fsdfs df", 8, 2, 3.4);
        System.out.println("Стоимость всех товаров Жени: " + jenyaBasket.getTotalPrice() + " руб.");
        romaBasket.print("\nСодержание корзины Жени:");

        System.out.println("\nКоличество корзин: " + Basket.countBasket+" корзин");

        System.out.println("\nСтоимость всех товаров в корзинах: "+Basket.totalPriceOfBaskets+" р.\nКоличество всех выбранных товаров: "+Basket.totalCountItemsOfBaskets+" шт.");
        System.out.println("\nСредняя стоимость товаров во всех корзинах: " + Basket.totalAverage+" р.");
        System.out.println("\nСредняя стоимость корзин: " + Basket.totalAverageBsaket+" р.");

//        basket1.clear();
//        System.out.println();
//        basket1.print("Содержимое корзины");
//        totalPrice = basket1.getTotalPrice();
//        System.out.println("Стоимость всех товаров: " + totalPrice);
    }
}
