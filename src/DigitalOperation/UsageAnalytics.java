package DigitalOperation;

public class UsageAnalytics {
    private int visitCount;

    public UsageAnalytics() {
        visitCount = 0;
    }

    public int countVisit() {
        return ++visitCount;
    }
}
