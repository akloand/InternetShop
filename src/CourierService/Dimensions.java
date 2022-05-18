package CourierService;

public class Dimensions {

    private int length;
    private int width;
    private int height;
    private final CourierService courierService;

    public Dimensions(int length, int width, int height, CourierService courierService) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.courierService = courierService;
    }

    public int volume() {
        return length * width * height;
    }

    public CourierService getCourierServices() {
        return courierService;
    }


    @Override
    public String toString() {
        return "Dimensions{" +
                "length=" + length +
                ", width=" + width +
                ", height=" + height +
                "}\n" + courierService;
    }
}
