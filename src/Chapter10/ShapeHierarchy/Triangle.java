package Chapter10.ShapeHierarchy;

public class Triangle extends TwoDimensional{
    private final double height;

    public Triangle(double area, double height) {
        super(area);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * getArea() * getHeight();
    }

    @Override
    public String toString() {
        return String.format("The area of the Triangle is: %.2f%n", calculateArea());
    }

}
