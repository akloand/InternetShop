package TestGerbertShield.AbstractClass;

public class Triangle extends Figure {
    public Triangle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    double area() {
        System.out.println("В области тереугольника. ");
        return dim1 * dim2 / 2;
    }
}
