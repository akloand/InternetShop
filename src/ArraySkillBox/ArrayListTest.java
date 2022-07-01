package ArraySkillBox;


import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {


        ArrayList<String> text = new ArrayList<>();

        text.add("0asdad");
        text.add("1asdad");
        text.add("2sadfasd");
        text.add("3fgdfgdg");
        text.add("4fgdfgdg");
        text.add("5fgdfgdg");

        text.add(1, "222s11111erwer");
        text.remove(5);


        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                text.add("70text");
            } else text.add("нечетный");


        }

        for (String s : text) {
            System.out.println(s);
        }
        //System.out.println(text);

    }
}
