package area_of_figures;

public class Main {
    public static void main(String[] args) {
        //area for the square
        Shape square = new Square(12.5);
        System.out.println(square.toString() + ". Area for the square: " + square.getArea()); //156.25

        //area for the triangle
        Shape triangle = new Triangle(3.0, 4.0, 5.0);
        System.out.println(triangle.toString() + ". Area for the triangle: " + triangle.getArea()); //6.0

        //area for the circle
        Shape circle = new Circle(1.0);
        System.out.println(circle.toString() + ". Area for the circle: " + circle.getArea()); //3.14

        //area for the ellipse
        Shape ellipse = new Ellipse(3.0, 5.0);
        System.out.println(ellipse.toString() + ". Area for the ellipse: " + ellipse.getArea()); //47.1
    }
}
