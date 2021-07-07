package area_of_figures;

public class Circle implements Shape {
    private final double p = 3.14;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "CIRCLE";
    }

    @Override
    public double getArea() {
        return p * Math.pow(radius, 2);
    }

    public double getRadius() {
        return radius;
    }
}
