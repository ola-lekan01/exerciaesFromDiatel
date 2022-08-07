package Chapter10.ShapeHierarchy;

public abstract class TwoDimensional extends ShapeHierarchy {

    public TwoDimensional(double area) {
        super(area);
    }

    public abstract double calculateArea();

    public abstract String toString();

}
