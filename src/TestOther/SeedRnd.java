package TestOther;


import java.util.Random;

public class SeedRnd {

    public static void main(String[] args) {
        Random rnd = new Random();

        double i = rnd.nextGaussian(1, 10);
        double i2 = rnd.nextGaussian(200, 1);

        System.out.println(i);
        System.out.println(i2);

        System.out.println(rnd.nextInt(-10, 1));

        int num = 0;
        int numTotal = 0;
        for (int j = 0; j < 20; j++) {
            num = rnd.nextInt(-10, 10);
            System.out.print(num + " ");
             numTotal += num;
        }
        System.out.println();
        System.out.println(numTotal);

        double numGus = 0;
        for (int j = 0; j < 20; j++) {
            numGus = rnd.nextGaussian(10, 10);
            System.out.print(numGus + " ");

        }
    }
}
