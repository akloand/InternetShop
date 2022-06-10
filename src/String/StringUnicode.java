package String;

import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class StringUnicode {
    public static void main(String[] args) {
        while (true) {

            System.out.println("Введи текст:");
            String text = new Scanner(System.in).nextLine();

            System.out.println("Введи исходную кодировку (UTF-8, windows-1251):");
            String startEncoding = new Scanner(System.in).nextLine();

            System.out.println("Введи конечную кодировку (UTF-8, windows-1251):");
            String finishEncoding = new Scanner(System.in).nextLine();

            String encode = null;
            try {
                encode = new String(text.getBytes(startEncoding), finishEncoding);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }

            System.out.println("Результат " + encode);


        }
    }
}
