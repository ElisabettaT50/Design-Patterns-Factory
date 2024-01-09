public class ShapeFactory {
    public static Shape createShape(ShapesEnum shape) {
        return switch (shape) {
            case CIRCLE -> new Circle();
            case TRIANGLE -> new Triangle();
            case SQUARE -> new Square();
            default -> null;
        };
    }
}
