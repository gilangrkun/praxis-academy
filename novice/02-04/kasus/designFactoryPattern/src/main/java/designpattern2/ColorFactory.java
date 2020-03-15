package designpattern2;

public class ColorFactory extends AbstractFactory {

    // Color color;

    @Override
    public Color getColor(String colorType) {
        if(colorType.equalsIgnoreCase("GREEN")) {
            return new Green();
        }
        if(colorType.equalsIgnoreCase("BLUE")) {
            return new Blue();
        }
        if(colorType.equalsIgnoreCase("RED")) {
            return new Red();
        }

        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        // TODO Auto-generated method stub
        return null;
    }
}