package DigitalOperation;

public class MainUsageAnalytics {

    public static void main(String[] args) {
        UsageAnalytics analytics = new UsageAnalytics();
        analytics.countVisit();
        analytics.countVisit();
        analytics.countVisit();

        int visit = analytics.countVisit();

        System.out.println("Всего посещений: " + visit);


        int x = 50;
        int value = x++ + ++x;

        System.out.println(value + " " + x);
    }
}
