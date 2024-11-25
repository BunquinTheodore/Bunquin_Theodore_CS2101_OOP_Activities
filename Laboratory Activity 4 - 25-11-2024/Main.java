public class Main {
    public static void main(String[] args) {
        Square square = new Square(15);
        Rectangle rectangle = new Rectangle(20, 10);
        Triangle triangle = new Triangle(10, 15, 20);
        
        Shape[] shapes = {square, rectangle, triangle};

        ShapeCollection collection = new ShapeCollection(shapes);
        collection.getPropertyValues();
    }
}