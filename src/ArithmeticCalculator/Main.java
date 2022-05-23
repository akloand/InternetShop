package ArithmeticCalculator;

public class Main {
    public static void main(String[] args) {
        ArithmeticCalculator calculator = new ArithmeticCalculator(5, 6);

        Operation operation = Operation.SUBSTRACT;


        int first = calculator.getFirst();
        int second = calculator.getSecond();

        switch (operation) {
            case ADD -> System.out.println("это сложение " + first + "+" + second + "=" + (first + second));
            case MULTYPLY -> System.out.println("это умножение " + first + "*" + second + "=" + (first * second));
            case SUBSTRACT -> System.out.println("это вычитание " + first + "-" + second + "=" + (first - second));
        }

    }
}
