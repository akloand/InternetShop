import All.Arithmetic;

public class Main2 {
    public static void main(String[] args) {


        Arithmetic value1 = new Arithmetic(10, 55);
        value1.getSum();
        value1.getMult();
        value1.getMax();
        value1.getMin();
        value1.getFactorial();
        System.out.println();

        Arithmetic value2 = new Arithmetic(60, 50, "Вася");
        value2.getString();
        value2.getMult();
        value2.getMax();
        value2.getMin();
        System.out.println();

        Arithmetic value3 = new Arithmetic(100, 55);
        value3.getSum();
        value3.getMult();
        value3.getMax();
        value3.getMin();
        value3.getFactorial();

    }

}

