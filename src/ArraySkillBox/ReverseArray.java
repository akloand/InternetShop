package ArraySkillBox;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        String[] array = {"a","b","c","n"};
        System.out.println(String.join(" ", array));

        reverse(array);

        int[] arrayDig = {1, 2, 3, 4, 5,};
        //System.out.println(Arrays.toString(arrayDig));
        Arrays.stream(arrayDig).forEach(System.out::println);
        reverse(arrayDig);

    }


    public static void reverse(String[] array) {
        for (int i = array.length-1; i >= 0; i--) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    public static void reverse(int[] array) {
        for (int i = array.length-1; i >= 0; i--) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
}
