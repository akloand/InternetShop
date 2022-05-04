public class Arithmetic {
    private int first;
    private int second;
    private String text;
    private int sum;
    private int mult;
    private int max, min;

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

    public void getString() {
        sum = first + second;
        System.out.println("Сумма чисел " + text + " " + first + " + " + second + " = " + sum);
    }

}


