package Chapter10.ShapeHierarchy;

public class Cube extends ThreeDimensional{
    public Cube(double area) {
        super(area);
    }

    @Override
    public double calculateArea() {
        return 6 * Math.pow(getArea(), 2);
    }

    @Override
    public double calculateVolume() {
        return Math.pow(getArea(), 3);
    }

    @Override
    public String toString() {
        return String.format("The area of the Cube is: %.2f%nThe Volume of the Cube is: %.2f%n", calculateArea(), calculateVolume());
    }
}
