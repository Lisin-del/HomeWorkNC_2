package area_of_figures;

public class Triangle implements Shape {
    private double side_a;
    private double side_b;
    private double side_c;
    private double perimeter;

    @Override
    public String toString() {
        return "TRIANGLE";
    }

    @Override
    public double getArea() {
        perimeter = (side_a + side_b + side_c)/2;
        return Math.sqrt(perimeter * (perimeter - side_a) * (perimeter - side_b) * (perimeter - side_c));


    }

    public Triangle(double side_a, double side_b, double side_c) {
        this.side_a = side_a;
        this.side_b = side_b;
        this.side_c = side_c;
    }

    public double getSide_a() {
        return side_a;
    }

    public double getSide_b() {
        return side_b;
    }

    public double getSide_c() {
        return side_c;
    }
}
