package String;

import java.util.Scanner;

public class PhoneCleanerRegex {
    public static void main(String[] args) {

        //System.out.println("введи номер телефона");

//        String numberPhone = new Scanner(System.in).nextLine();
        String numberPhone = "+7 905 123-45-67";


        phoneRegex(numberPhone);
        phoneRegex("9-453-1234567");


    }

    public static void phoneRegex(String numberPhone) {

        String text = numberPhone.trim().replaceAll("[\\.|\\-|\s+|\\(|\\|\\+)]", "");

        if (text.length() != 11) {
            System.out.println("Номер: " + numberPhone + " введен неверно!!! в номере "+text.length()+" символов.");
        } else {
            System.out.println(numberPhone+" - "+text+ " в номере "+text.length()+" символов. Номер записан верно");
        }

    }

}
