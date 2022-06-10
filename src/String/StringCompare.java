package String;

import java.util.Scanner;

public class StringCompare {
    public static void main(String[] args) {
        while (true) {

            System.out.println("Введи первую строку");
            String first = new Scanner(System.in).next();

            System.out.println("Введи вторую строку");
            String second = new Scanner(System.in).next();


            long start = System.currentTimeMillis();
            int comparison = first.compareTo(second);
            int f = first.length();
            int s = second.length();

            if (comparison == 0) {
                System.out.println(first + " = " + second);
            } else if (comparison > 0) {
                System.out.println(first + " > " + second);
            } else System.out.println(first + " < " + second);
            System.out.println(f+" "+s);
            System.out.println(System.currentTimeMillis()-start+" мс");


        }
    }
}
