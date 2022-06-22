package String;

import java.util.Scanner;

public class StringSplitTestRegex {

    public static void main(String[] args) {
        System.out.println("введи английский текст: ");
        String text = new Scanner(System.in).nextLine();

        textNewString(text);
    }

    public static void textNewString(String text) {
        String regexSymbol = "[,|.|?|!|&|\\/]";
        String delSymbol = text.trim().replaceAll(regexSymbol, "").replaceAll("[\s]+"," ");

        String[] words = delSymbol.split(" ");
        for (String word : words) {
            System.out.println(word);

        }
    }
}
