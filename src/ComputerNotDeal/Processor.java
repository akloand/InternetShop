package ComputerNotDeal;

public class Processor {
    private final double frequency;
    private final int coreQuantity;
    private final String production;
    private final double weight;

    public Processor(double frequency, int coreQuantity, String production, double weight) {
        this.frequency = frequency;
        this.coreQuantity = coreQuantity;
        this.production = production;
        this.weight = weight;
    }

    public double getFrequency() {
        return frequency;
    }

    public int getCoreQuantity() {
        return coreQuantity;
    }

    public String getProduction() {
        return production;
    }

    public double getWeight() {
        return weight;
    }
}
