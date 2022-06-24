package String;


import static AndrianCode.Andrian.*;

public class TextSplit2 {

    public static void main(String[] args) {

        String text = "  Это просто текст, для примера работы 6000 программы 5000";
        splitAndy(text,false);
        splitAndy(text,true);

        int sum = 0;
        String[] textArr = splitAndyArray(text);
        for (int i = 0; i < textArr.length; i++) {
            try {
                int d = Integer.parseInt(textArr[i]);
                sum += d;
                System.out.println(d);
            } catch (NumberFormatException e) {
            }
        }
        System.out.println(sum);





    }

}
