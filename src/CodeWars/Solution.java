package CodeWars;


import static AndrianCode.Andrian.firstUpperCase;

public class Solution {
    private static Object firstUpperCase;

    static String toCamelCase(String s) {

        String[] words = s.split("_|-|\s");
        String newPhrase = words[0];
        for (int i = 1; i < words.length; i++) {
            newPhrase += words[i].substring(0, 1).toUpperCase()+ words[i].substring(1);

//            newPhrase += firstUpperCase(words[i]);
        }
        return newPhrase;
    }
}


