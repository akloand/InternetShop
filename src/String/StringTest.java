package String;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public class StringTest {
    public static void main(String[] args) {
        String text = "fgdfgdfg DDFGGG Вввыедт что нибуль";
        String encode = null;
        try {
            encode = new String(text.getBytes(), "windows-1251");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        System.out.println(encode);

    }
}
