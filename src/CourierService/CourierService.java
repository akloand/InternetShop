package CourierService;

public class CourierService {

    private final int dimensions;
    private final double weight;
    private final String address;
    private final boolean flip;
    private final String regNumber;
    private final boolean fragile;


    public CourierService(int dimensions, double weight, String address, boolean flip, String regNumber, boolean fragile) {
        this.dimensions = dimensions;
        this.weight = weight;
        this.address = address;
        this.flip = flip;
        this.regNumber = regNumber;
        this.fragile = fragile;
    }

    public CourierService() {
        weight = 0;
        address = "N/A";
        flip = false;
        regNumber = "N/A";
        fragile = false;
        dimensions = 0;
    }

    public CourierService setWeight(double weight) {
        return new CourierService(dimensions, weight, address, flip, regNumber, fragile);
    }

    public CourierService setAddress(String address) {
        return new CourierService(dimensions, weight, address, flip, regNumber, fragile);
    }

    public CourierService setFlip(boolean flip) {
        return new CourierService(dimensions, weight, address, flip, regNumber, fragile);
    }

    public CourierService setRegNumber(String regNumber) {
        return new CourierService(dimensions, weight, address, flip, regNumber, fragile);
    }

    public CourierService setFragile(boolean fragile) {
        return new CourierService(dimensions, weight, address, flip, regNumber, fragile);
    }




    public double getWeight() {
        return weight;
    }

    public String getAddress() {
        return address;
    }

    public boolean isFlip() {
        return flip;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public boolean isFragile() {
        return fragile;
    }


    @Override
    public String toString() {
        return "CourierService{" +
                "weight=" + weight +
                ", address='" + address + '\'' +
                ", flip=" + flip +
                ", regNumber='" + regNumber + '\'' +
                ", fragile=" + fragile +
                '}';
    }
}
