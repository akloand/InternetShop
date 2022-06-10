package String;

import java.nio.charset.Charset;
import java.util.Scanner;

public class StringParse {

    public static void main(String[] args) {

        String charset = Charset.defaultCharset().displayName();
        System.out.println(charset);

        while (true) {

            System.out.println("введите выражение например 25 + 35 ");
            String value = new Scanner(System.in).nextLine();

            String trim = value.trim();
            String[] parts = trim.split(" ");

            int firstNumber = Integer.parseInt(parts[0]);
            int secondNumber = Integer.parseInt(parts[2]);

            String sign = parts[1];
            int result = 0;
            String totalSign = "";

            switch (sign) {
                case "+":
                    result = firstNumber + secondNumber;
                    totalSign = " + ";
                    break;

                case "-":
                    result = firstNumber - secondNumber;
                    totalSign = " - ";
                    break;

                case "*":
                    result = firstNumber * secondNumber;
                    totalSign = " * ";
                    break;
                case "/":
                    result = firstNumber / secondNumber;
                    totalSign = " / ";
                    break;
            }

            System.out.println(firstNumber + totalSign + secondNumber + " = " + result);

        }
    }
}
