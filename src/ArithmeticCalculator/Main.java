package ArithmeticCalculator;

public class Main {
    public static void main(String[] args) {
        ArithmeticCalculator calculator = new ArithmeticCalculator(7, 6);

        Operation operation = Operation.ADD;

        double first = calculator.getFirst();
        double second = calculator.getSecond();

        double div = first / second;
        switch (operation) {
            case ADD -> System.out.println("это сложение " + first + "+" + second + "=" + (first + second));
            case MULTYPLY -> System.out.println("это умножение " + first + "*" + second + "=" + (first * second));
            case SUBSTRACT -> System.out.println("это вычитание " + first + "-" + second + "=" + (first - second));
            case DIV -> System.out.println("это деление " + first + "/" + second + "=" + div);
        }
    }
}
