public class ShapeFactory {
    public static Shape createShape(ShapesEnum shape) {
        switch (shape) {
            case CIRCLE:
                return new Circle();
            case TRIANGLE:
                return new Triangle();
            case SQUARE:
                return new Square();
            default:
                return null;
        }
    }
}
