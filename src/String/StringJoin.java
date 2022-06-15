package String;

import java.util.StringJoiner;

public class StringJoin {
    public static void main(String[] args) {
        String name1 = "Петя";
        String name2 = "Рома";
        String name3 = "Кеша";

        //1 - вариант
        String list = String.join(", ", name1, name2, name3);

        System.out.println(list);

        //2 - вариант

        StringJoiner joiner = new StringJoiner(", ");
        joiner.add(name1);
        joiner.add(name2);
        joiner.add(name3);

        System.out.println(joiner);


    }



}
