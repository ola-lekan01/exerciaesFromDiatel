package Chapter10.Question10_14;

public abstract class ShapeHierarchy {
    private final double area;

    public ShapeHierarchy(double area){
        this.area = area;
    }

    public double getArea() {
        return area;
    }
    public abstract double calculateArea();

    public abstract String toString();

}
