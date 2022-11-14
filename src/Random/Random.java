package Random;

public class Random {


    public static void main(String[] args) {
        java.util.Random r = new java.util.Random();
        int rnd = r.nextInt(5)+1;
        int rnd2 = r.nextInt(5)+1;
        int rnd3 = r.nextInt(5)+1;
        double rnd4 = r.nextDouble(5);


        System.out.println(rnd);
        System.out.println(rnd2);
        System.out.println(rnd3);
        System.out.println(rnd4);


    }


}
