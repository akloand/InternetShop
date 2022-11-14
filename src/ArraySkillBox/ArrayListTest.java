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
        text.add("ббббббб");
        text.add("5fgdfgdg");
        text.add("aaaaaaa");
        text.add("Bbbbbbb");
        text.add("ааааааа");
        text.add("ввввввв");
        text.add("ccccccc");

        text.add(1, "22addTo1");
        text.remove(5);


        ArrayList<String> textCopy = text;

        text.sort(String::compareToIgnoreCase);

//        for (int i = 0; i < 10; i++) {
//            if (i % 2 == 0) {
//                text.add("70text");
//            } else text.add("нечетный");
//        }

//        for (String s : text) {
//            System.out.println(s);
//        }

        for (String l : textCopy) {
            System.out.println(l);
        }
        //System.out.println(text);

    }
}
