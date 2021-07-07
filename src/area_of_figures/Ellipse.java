package area_of_figures;

public class Ellipse implements Shape {
    private double radius_a;
    private double radius_b;
    private final double p = 3.14;

    @Override
    public String toString() {
        return "ELLIPSE";
    }

    @Override
    public double getArea() {
        return radius_a * radius_b * p;
    }

    public Ellipse(double radius_a, double radius_b) {
        this.radius_a = radius_a;
        this.radius_b = radius_b;
    }

    public double getP() {
        return p;
    }

    public double getRadius_a() {
        return radius_a;
    }

    public double getRadius_b() {
        return radius_b;
    }
}
