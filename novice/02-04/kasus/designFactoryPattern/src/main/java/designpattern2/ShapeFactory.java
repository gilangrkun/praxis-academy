package designpattern2;

public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType) {
        if(shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        }
        if(shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }
        if(shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }

        return null;
    }

    @Override
    public Color getColor(String colorType) {
        // TODO Auto-generated method stub
        return null;
    }

    // Shape shape;

    
}