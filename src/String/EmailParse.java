package String;

public class EmailParse {

    public static void main(String[] args) {
        String userInfo = "135|bender|0|bender@gmail.com";
        System.out.println(getUserEmail(userInfo));
        // Вывод: bender@gmail.com

    }

    static String getUserEmail(String userInfo){
            String[] data = userInfo.split("\\|");
            return data[3] + " - "+(data.length); // или data[data.length - 1]

        }
    }





