package Chapter10.Question10_14;

public abstract class ThreeDimensional extends ShapeHierarchy{

    public ThreeDimensional(double area) {
        super(area);
    }
    public abstract double calculateArea();

    public abstract double calculateVolume();

    public abstract String toString();
}
