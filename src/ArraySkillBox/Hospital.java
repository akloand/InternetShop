package ArraySkillBox;

import java.util.Arrays;

import static AndrianCode.Andrian.randomRange;

public class Hospital {


    public static void main(String[] args) {

        generatePatientsTemperature(5);

        float[] arr = generateTemperature(50000);
        System.out.println(Arrays.toString(arr));
        getReport(arr);

    }
    //генерирует МАССИВ пациентов обрабатывает этот МАССИВ (слитный метод)
    public static void generatePatientsTemperature(int qtyPatients) {
        float[] temp = new float[qtyPatients];

        float tempAverage = 0;
        double sum = 0;
        int count = 0;
        int c = 0;
        String isHealth = "";
        for (float i : temp
        ) {
            i = randomRange(32, 40);
            if (i >= 36.2 && i <= 36.9) {
                count++;
                isHealth = "здоров " + count;
            } else {
                isHealth = "болен";
            }
            sum += i;
            System.out.println(i + " - " + ++c + " пациент - " + isHealth);
        }
        tempAverage = (float) (sum / temp.length);

        System.out.println(count + " здоровых пациент-а(ов)");
        System.out.println(tempAverage + " средняя температура по больнице");
    }

    //1. генерирует МАССИВ пациентов с температурой в диапазоне 32-40градусов (разделенный метод на два метода)
    private static float[] generateTemperature(int qtyPatients) {
        float[] temp = new float[qtyPatients];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = (float) randomRange(32, 40);
        }
        return temp;
    }

    //2. принимает и обрабатывает сгенерированный МАССИВ (разделенный метод на два метода)
    public static void getReport(float[] a) {

        float tempAverage = 0;
        double sum = 0;
        int count = 0;
        int c = 0;
        String isHealth = "";

        int arrLength = a.length;

        for (int i = 0; i < arrLength; i++) {
            if (a[i] >= 36.2 && a[i] <= 36.9) {
                count++;
                isHealth = "здоров " + count;
            } else {
                isHealth = "болен";
            }
            sum += a[i];
            System.out.println(a[i] + " - " + ++c + " пациент - " + isHealth);
        }

        tempAverage = (float) (sum / arrLength);

        System.out.println(count + " здоровых пациент-а(ов)");
        System.out.println(tempAverage + " средняя температура по больнице");

    }
}
