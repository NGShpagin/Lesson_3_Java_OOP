package Homework_Ex_1_Figures;

public class App {
    public static void main(String[] args) {
        Square square = new Square();
        square.setSide(10);
        System.out.printf("SquareArea: %f\n", square.getArea());

        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(5);
        rectangle.setWidth(10);
        System.out.printf("RectangleArea: %f\n", rectangle.getArea());

        Circle circle = new Circle();
        circle.setRadius(4);
        System.out.printf("CircleArea: %f\n", circle.getArea());

        Ellipse ellipse = new Ellipse();
        ellipse.setMinorRadius(5);
        ellipse.setMajorRadius(8);
        System.out.printf("EllipseArea: %f\n",ellipse.getArea());
    }
}
