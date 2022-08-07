package Chapter10.ShapeHierarchy;

public class Circle extends TwoDimensional{

    public Circle(double area) {
        super(area);
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(getArea(), 2);
    }

    @Override
    public String toString() {
        return String.format("The area of the Circle is: %.2f%n", calculateArea());
    }
}
