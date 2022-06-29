package ArraySkillBox;

import java.util.Arrays;

import static AndrianCode.Andrian.randomRange;

public class ArrayTwoDimension {


    public static void main(String[] args) {

        char arrayTwo[][] = getTwoDimArrayX(20,'X','·');
//        System.out.println(Arrays.toString(getTwoDimArrayX(7)));

        for (int i = 0; i < arrayTwo.length; i++) {
            for (int j = 0; j < arrayTwo[i].length; j++) {
                System.out.print(arrayTwo[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static char[][] getTwoDimArrayX(int size, char ch1, char ch2) {
        char[][] arr = new char[size][size];

        int count = 0;
        int diminish = size-1;

        for (int i = 0; i < arr.length; i++) { //7
            for (int j = 0; j < arr[i].length; j++) { //7
                if (i == j || i == count && j == diminish) {
                    arr[i][j] = ch1;
                } else arr[i][j] = ch2;

            }
            count++;
            diminish--;
        }

        if (size > 5) {

            for (int i = 0; i < arr.length; i++) { //7
                for (int j = 0; j < arr[i].length; j++) { //7

                    if (i>=2 && i<=arr.length - 3 && j>=2 && j<=arr[i].length - 3)  {
                        if (i == 2 || i == arr.length - 3 || j == 2 || j == arr[i].length - 3) {

                            arr[i][j] = ' ';
                        }
                    }

                }
            }
        }

        return arr;
    }

}
//arr[i][j] = (char) randomRange(65, 91);