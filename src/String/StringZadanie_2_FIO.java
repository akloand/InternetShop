package String;

import java.util.Scanner;

import static String.FirstUpperCase.firstUpperCase;

public class StringZadanie_2_FIO {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Введи Ф.И.О. сотрудника: ");
            String text = new Scanner(System.in).nextLine().trim();

            String[] word = text.split("\s+");

            System.out.println(word.length);
            if (word.length != 3) {
                System.out.println("Ф.И.О. введено неправльно!!!");
                continue;
            }

            String[] temp = new String[word.length];

            temp[0] = firstUpperCase(word[0]);
            temp[1] = firstUpperCase(word[1]);
            temp[2] = firstUpperCase(word[2]);

            String template = "Фамилия: %s\nИмя: %s\nОтчество: %s\n\n";
            System.out.printf(template, temp[0], temp[1], temp[2]);

        }
    }
}
