package ArraySkillBox;

public class ReverseArray {

    public static void main(String[] args) {

        String[] array = {"a","b","c","n"};
        reverse(array);

        int[] arrayDig = {1, 2, 3, 4, 5,};
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
