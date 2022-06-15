package String;

public class StringFormatTemplate {
    public static void main(String[] args) {
        String name = "Maxim";
        int birthDay = 1986;
        //{"name": "Maxim", "birthDay": "1986"}

        String template = "{\"name\": \"%s\", \"birthDay\": \"%d\"}";  //шаблон

        // 1-вариант
        System.out.println("1-вариант");
        String result = String.format(template, name, birthDay);
        System.out.println(result);

        // 2-вариант
        System.out.println("2-вариант");
        System.out.printf(template, name, birthDay);


    }



}
