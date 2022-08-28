package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCollection {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(30);
        list.add("sdfsfsdf");
        list.add("fdgdfgty");
        list.add("ewerterter");
        list.add("qwwqwe123");
        list.add("sdfdfss_232f");

        Collections.sort(list);
        for (String s : list) {
            System.out.print(s + " - ");
        }

        List<String> listCopy = list;

        System.out.println();

        Collections.sort(listCopy, (o1, o2) -> listCopy.size());

        for (String d : listCopy) {
            System.out.print(d + " - ");
        }

    }
}
