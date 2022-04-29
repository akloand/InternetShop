public class Arithmetic {
    private int first;
    private int second;
    private int sum;
    private int mult;
    private int max, min;

    public Arithmetic(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public void arithmetic(int first, int second) {
        sum = first + second;
        mult = first * second;

        if (first < second) {
            min = first;
        } else {
            max = second;
        }
    }

    public void getSum() {
        System.out.println("Сумма чисел " + first + " + " + second + " = " + sum);
    }

    public void getMult() {
        System.out.println("Произведение чисел " + first + " * " + second + " = " + mult);
    }


    public static void main(String[] args) {

        Arithmetic value1 = new Arithmetic();
        value1.arithmetic(5, 6);
        value1.getSum();
        value1.getMult();


    }

}

