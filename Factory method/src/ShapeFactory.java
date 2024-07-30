import java.awt.*;

public class ShapeFactory {

    public Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("Rectangle")) {
            return new Square();
        }
        if (shapeType.equalsIgnoreCase("Circle")) {
            return new Circle();
        }
        return null; // no such shape is supported yet.
    }
}
