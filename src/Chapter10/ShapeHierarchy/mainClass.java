package Chapter10.ShapeHierarchy;

public class mainClass {
    public static void main(String[] args) {

        ShapeHierarchy [] shapes = new ShapeHierarchy[6];

        Circle circle = new Circle(6.0);
        Square square = new Square(5.0);
        Triangle triangle = new Triangle(7.5, 5.5);
        Tetrahedron tetrahedron = new Tetrahedron(8.6);
        Sphere sphere = new Sphere(4.8);
        Cube cube = new Cube(7.5);

        shapes[0] = circle;
        shapes[1] = square;
        shapes[2] = triangle;
        shapes[3] = tetrahedron;
        shapes[4] = sphere;
        shapes[5] = cube;

        for(ShapeHierarchy shape : shapes) {
            System.out.println("The shape is a " + shape.getClass().getSimpleName());
            System.out.println(shape);
        }
    }
}
