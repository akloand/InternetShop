package String;


public class SequentialWordsNumbers {

    public static void main(String[] args) {

        String text = "Это просто текст, для примера работы программы";
        sequentialWordsNumbers(text);
        sequentialWordsNumbersIdexOf(text);


    }

    public static void sequentialWordsNumbers(String text) {
        String[] words = text.trim().split(" ");

        int ii = 0;
        for (String x : words) {
            System.out.print("(" + ++ii + ") " + x + " ");
        }
        System.out.println();

        for (int i = 0; i < words.length; i++) {
            System.out.print("(" + (i + 1) + ") " + words[i] + " ");
        }
        System.out.println();
    }

    public static void sequentialWordsNumbersIdexOf(String text) {

        int spaceCount = 0;
        int count = 0;
        int[] array = new int[text.length()];


        for (char c : text.toCharArray()) {
            count++;
            if (c == ' ') {
                spaceCount++;
                array[spaceCount] = count;
            }
            System.out.print(spaceCount + " " );
            System.out.println(count);
        }


        for (int i = 0; i < spaceCount; i++) {
            int space = text.indexOf(" ");
            int a = array[i];
            int b = array[i+1];
            //int a =
            String word = text.substring(a, b);
            System.out.print("("+(i+1)+") "+word);
            System.out.print(a + " " + b);
        }
    }

}
