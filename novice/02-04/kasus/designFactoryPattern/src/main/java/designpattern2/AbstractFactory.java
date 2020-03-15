package designpattern2;

public abstract class AbstractFactory {

    abstract Shape getShape(String shapeType);

    abstract Color getColor(String colorType);

}