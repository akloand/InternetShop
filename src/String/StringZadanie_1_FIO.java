package String;

import java.util.Scanner;

import static String.FirstUpperCase.firstUpperCase;

public class StringZadanie_1_FIO {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Введи ФИО сотрудника: ");
            Scanner scanner = new Scanner(System.in);
//        Scanner scanner = new Scanner("zxc asda qweqw");
            String fullName = scanner.nextLine().trim();

//        System.out.println(fullName);
            int spaceCount = 0;
            for (char c : fullName.toCharArray()) {
                if (c == ' ') {
                    spaceCount++;
                }
            }

            if (fullName.isEmpty() || spaceCount != 2) {
                System.out.println("ФИО введено неверно!!!\n");
                //System.out.println("кол-во пробелов " + spaceCount);
            } else {

                int firstSpace = fullName.indexOf(" ");
                String firstName = firstUpperCase(fullName.substring(0, firstSpace));

                int secondSpace = fullName.lastIndexOf(" ");
                String secondName = firstUpperCase(fullName.substring(firstSpace + 1, secondSpace));

                String thirdName = firstUpperCase(fullName.substring(secondSpace + 1));

                String template = "Фамилия: %s\nИмя: %s\nОтчество: %s\n\n";

                System.out.printf(template, firstName, secondName, thirdName);
            }

        }
    }
}
