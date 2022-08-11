package Chapter10.Question10_14;

public class Square extends TwoDimensional{

    public Square(double area) {
        super(area);
    }

    @Override
    public double calculateArea() {
        return Math.pow(getArea(), 2);
    }

    @Override
    public String toString() {
        return String.format("The area of the Square is: %.2f%n", calculateArea());
    }
}
