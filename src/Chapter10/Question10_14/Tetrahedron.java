package Chapter10.Question10_14;

public class Tetrahedron extends ThreeDimensional{

    public Tetrahedron(double area) {
        super(area);
    }

    @Override
    public double calculateArea() {
        return Math.sqrt(3) * Math.pow(getArea(), 2);
    }

    @Override
    public double calculateVolume() {
        return Math.pow(getArea(), 2) /  6 * Math.sqrt(2);
    }

    @Override
    public String toString() {
        return String.format("The area of the Tetrahedron is: %.2f%nThe Volume of the Tetrahedron is: %.2f%n", calculateArea(), calculateVolume());
    }
}
