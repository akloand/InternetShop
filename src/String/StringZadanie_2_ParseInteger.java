package String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringZadanie_2_ParseInteger {
    public static void main(String[] args) {

        String text = "Вася заработал 3000 рублей, Петя - 7000 рубля, а Маша - 30000 рублей, а Антон - 7000 рублей";
        int sum = 0;
        String[] words = text.split(" ");

        Pattern pattern = Pattern.compile("[0-9]+");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
//            System.out.println(matcher.group());
            int d = Integer.parseInt(matcher.group());

            System.out.println(d);

            sum += Integer.parseInt(matcher.group());
        }

        System.out.println("Общая сумма всех ребят: " + sum + "р.");

    }
}
