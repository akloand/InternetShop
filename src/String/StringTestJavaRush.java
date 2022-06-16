package String;

import java.util.Arrays;

//https://javarush.ru/groups/posts/2907-metod-split-v-java-delim-stroku-na-chasti

public class StringTestJavaRush {
    public static void main(String[] args) {
        print("I love Java".split(" "));
        print(" I love Java".split(" "));
        print("I love Java ".split(" "));
        print(" I love Java ".split(" "));

    }

    static void print(String[] arr) {
        System.out.println(Arrays.toString(arr));
    }






}

