package All;

import java.math.BigInteger;

public class Arithmetic {
    private int first;
    private int second;
    private String text;
    private int sum;
    private int mult;
    private int max, min;
    private int fact = 1;

    public Arithmetic(int first) {
        this.first = first;
    }

    public Arithmetic(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public Arithmetic(int first, int second, String text) {
        this.first = first;
        this.second = second;
        this.text = text;
    }

    public void getSum() {
        sum = first + second;
        System.out.println("Сумма чисел " + first + " + " + second + " = " + sum);
    }

    public void getMult() {
        mult = first * second;
        System.out.println("Произведение чисел " + first + " * " + second + " = " + mult);
    }

    public void getMax() {
        if (first < second) {
            max = second;
        } else {
            max = first;
        }
        System.out.println("Max = " + max);
    }

    public void getMin() {
        if (first > second) {
            min = second;
        } else {
            min = first;
        }
        System.out.println("Min = " + min);
    }

    public void getFactorial() {
        BigInteger factorial = BigInteger.ONE;
        for (int i = 1; i <= first; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.println("Факториал " + first + " равен " + factorial);

    }


    public void getString() {
        sum = first + second;
        System.out.println("Сумма чисел " + text + " " + first + " + " + second + " = " + sum);
    }

}


