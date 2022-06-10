package String;

import java.util.Scanner;

public class StringTest2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введи https://domen.ru/about/reviews");
        String path = console.nextLine();

        int index = path.indexOf("//");
        int index2 = path.indexOf("/", index +3);

        String first = path.substring(0, index + 2);
        String last = path.substring(index2);

        String result = first + "javarush.ru" + last;
        System.out.println(first);
        System.out.println(last);
        System.out.println(index+" "+index2);

        System.out.println(result);

    }


}
