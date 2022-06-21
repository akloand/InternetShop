package String;

public class StringRegularRegex {
    public static void main(String[] args) {

        //регулярные выражения для автомобильных номеров
        String number = "A785mk39";

        String lettersReg = "[ABEKMHOPCTYXabekmhopctyx]";

        String regex = lettersReg + "[0-9]{3}" + lettersReg + "{2}[0-9]{2,3}";


        //System.out.println(number.matches(regex));

        if (!number.matches(regex)) {
            System.out.println("Номер " + number + " введен неверно!!!");
        } else {
            System.out.println("Номер " + number + " введен верно");
        }

        //регулярные выражения для Email
        String email = "ako@mail.com";

        String regexEmail = "[_A-Za-z0-9]{0,20}[@][A-Za-z0-9]{0,10}[.][A-Za-z0-9]{0,5}";

        boolean emailIsTrue = email.matches(regexEmail);

        if (emailIsTrue) {
            System.out.println("Email: " + email + " указан верно");
        } else {
            System.out.println("Error "+email+" ОШИБКА в адресе!!!");
        }


    }
}
