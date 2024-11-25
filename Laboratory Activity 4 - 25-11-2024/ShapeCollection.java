public class ShapeCollection {
    private Shape[] shapes;
    
    public ShapeCollection(Shape[] shapes) {
        this.shapes = shapes;
    }
    
    public void printShapeSummary() {
        for (Shape shape : shapes) {
            System.out.println(shape.getShapeType());
            System.out.println(String.format("Area: %.2f", shape.getArea()));
            System.out.println(String.format("Perimeter: %.2f", shape.getPerimeter()));
            System.out.println();
        }
    }
}