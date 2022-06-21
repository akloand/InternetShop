package String;

public class StringZadanie_1_ParseInteger {
    public static void main(String[] args) {

        String text = "Вася заработал 3000 рублей, Петя - 7000 рубля, а Маша - 30000 рублей, а Антон - 7000 рублей";
        int sum = 0;
        String[] words = text.split(" ");

        for (String word : words) {
            //System.out.println(word);
            try {
                int d = Integer.parseInt(word);
                sum += d;
                System.out.println(d);

            } catch (NumberFormatException e) {
                //System.out.println("это текст");
            }
        }
        System.out.println("Общая сумма всех ребят: " + sum + "р.");

    }
}
