package Chapter10.Question10_14;

public abstract class TwoDimensional extends ShapeHierarchy {

    public TwoDimensional(double area) {
        super(area);
    }

    public abstract double calculateArea();

    public abstract String toString();

}
