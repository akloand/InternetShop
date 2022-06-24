package String;

import java.util.Scanner;

public class PhoneCleanerRegex {
    public static void main(String[] args) {
        //System.out.println("введи номер телефона");
//        String numberPhone = new Scanner(System.in).nextLine();
//        String numberPhone = "+7 905 123-45-67";
//        phoneRegex(numberPhone);

        phoneRegex("+7 909 123-45-67");
        phoneRegex("+7 (909) 1234567");
        phoneRegex("8-905-1234567");
        phoneRegex("9-453-1234567");
        phoneRegex("8-905-123");
        phoneRegex("905-1234567");
        phoneRegex("8-905-12345672342");

    }

    public static void phoneRegex(String numberPhone) {

        String text = numberPhone.trim().replaceAll("[\\.|\\-|\s+|\\(|\\|\\+)]", "");

        String regex = "[7-8][\\d]{10}";
        String totalNumber = "";

        if (text.length() == 10) {
            totalNumber = "7" + text;
        } else {
            totalNumber = text;}

        String regexFirstDig = "^[7-8]";
        totalNumber = totalNumber.replaceFirst(regexFirstDig, "7");

        boolean isRegex = totalNumber.matches(regex);

        //System.out.println(isRegex);
        if (!isRegex) {
            System.out.println("--- : " + numberPhone + " введен неверно!!! " + totalNumber + " в номере " + text.length() + " цифр.");
        } else {
            System.out.println("+++ : "+numberPhone + " - " + totalNumber + " в номере " + text.length() + " цифр. Номер записан верно");
        }

    }

}
