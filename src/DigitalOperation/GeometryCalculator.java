package DigitalOperation;

public class GeometryCalculator {

    public static void circleSquare(double r) {
        if (r > 0) {
            double square = Math.round(Math.PI * r * r * 100);
            square /= 100;
            System.out.println("Площадь круга: " + square + "м²");
        } else {
            System.out.println("Площадь круга не определена, значение радиуса отрицательное "+r );
        }
    }

    public static void triangleSquare(double a, double b, double c) {
        double p = (a + b + c) / 2; //полупериметр
        double max = Math.max(a, c);
        double maxLength = Math.max(max, c);

        boolean triangle = (a + b > c) & (a + c > b) & (b + c > a);

        if (triangle) {
            double square = Math.round(Math.sqrt(p * (p - a) * (p - b) * (p - c)) * 100);
            square /= 100;
            System.out.println("Площадь треугольника: " + square + " м²");
        } else {
            System.out.println("Построение треугольника невозможно!!! Максимальная длина треугольника должна быть меньше " + ((a + b + c) - maxLength)
                    + " м");

        }
    }

    public static void sphereVolume(double r) {
        if (r > 0) {
            double volume = Math.round(4 / 3 * Math.PI * r * r * r * 100);
            volume /= 100;
            System.out.println("Объём шара: " + volume + "м³");
        } else {
            System.out.println("Объём круга не определен, значение радиуса отрицательное "+r );
        }
    }

    public static void triangleTrue(double a, double b, double c) {
        boolean triangle = (a + b > c) & (a + c > b) & (b + c > a);
        System.out.println(triangle);
    }

}
