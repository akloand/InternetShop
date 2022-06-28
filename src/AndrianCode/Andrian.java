package AndrianCode;

public class Andrian {

    //заглавная буква для слова
    public static String firstUpperCase(String word) {
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }

    //разбиение текста на слова, при помощи indexOf с доп. аргументом с новой строки или нет
    public static void splitAndy(String textArg, boolean isNewString) {

        int spaceCount = 0;
        int count = 0;
        int[] arrayPosition = new int[textArg.length()];

        String text = textArg.trim().replaceAll("[\\,\\.\\?\\!]", "").replaceAll("[\\s]+", " ") + " "; //в конце +" " - это костыль для того, чтоб выводило последнее слово
        for (char c : text.toCharArray()) { //считает количество пробелов
            count++;
            if (c == ' ') {
                spaceCount++;
                arrayPosition[spaceCount] = count;
            }
        }

        String[] arrayWords = new String[spaceCount]; //создали массив с числом количества пробелов

        for (int i = 0; i < spaceCount; i++) {
            int space = textArg.indexOf(" ");
            int a = arrayPosition[i];
            int b = arrayPosition[i + 1];
            //int a =
            arrayWords[i] = text.substring(a, b).trim(); //наполнение массива отдельными словами
            String word = text.substring(a, b);
//            System.out.println(a+" "+b);
        }

        for (String word : arrayWords) {
            if (isNewString) {
                System.out.println(word);
            } else System.out.print(word + " ");
        }
        System.out.println();

    }

    //создание массива из слов введенного текста, при помощи indexOf
    public static String[] splitAndyArray(String textArg) {

        int spaceCount = 0;
        int count = 0;
        int[] arrayPosition = new int[textArg.length()];

        String text = textArg.trim().replaceAll("[\\,\\.\\?\\!]", "").replaceAll("[\\s]+", " ") + " "; //в конце +" " - это костыль для того, чтоб выводило последнее слово
        for (char c : text.toCharArray()) { //считает количество пробелов
            count++;
            if (c == ' ') {
                spaceCount++;
                arrayPosition[spaceCount] = count;
            }
        }

        String[] arrayWords = new String[spaceCount]; //создали массив с числом количества пробелов

        for (int i = 0; i < spaceCount; i++) {
            int space = textArg.indexOf(" ");
            int a = arrayPosition[i];
            int b = arrayPosition[i + 1];
            //int a =
            arrayWords[i] = text.substring(a, b).trim(); //наполнение массива отдельными словами
            String word = text.substring(a, b);
//            System.out.println(a+" "+b);
        }

        return arrayWords;


    }

    //Рандомное число по диапазону
    public static float randomRange(int min, int max) {
        double rnd = Math.random();
        float value = min + (float) Math.round(rnd * (max - min) * 10) / 10;
        return value;

//        System.out.println(value + " - от " + min + " до " + max);


    }


}







