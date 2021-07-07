package area_of_figures;

public class Square implements Shape {
    private double side;

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return "SQUARE";
    }
    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

}
