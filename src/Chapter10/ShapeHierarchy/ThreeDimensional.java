package Chapter10.ShapeHierarchy;

public abstract class ThreeDimensional extends ShapeHierarchy{

    public ThreeDimensional(double area) {
        super(area);
    }
    public abstract double calculateArea();

    public abstract double calculateVolume();

    public abstract String toString();
}
