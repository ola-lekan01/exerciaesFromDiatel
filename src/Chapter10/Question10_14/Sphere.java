package Chapter10.Question10_14;

public class Sphere extends ThreeDimensional{

    public Sphere(double area) {
        super(area);
    }

    @Override
    public double calculateArea() {
        return 4 * Math.PI * Math.pow(getArea(), 2);
    }

    @Override
    public double calculateVolume() {
        return 4.0 / 3.0 * Math.PI * Math.pow(getArea(), 3);
    }

    @Override
    public String toString() {
        return String.format("The area of the Sphere is: %.2f%nThe Volume of the Sphere is: %.2f%n", calculateArea(), calculateVolume());
    }
}
