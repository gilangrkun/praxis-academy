package designpattern2;

public class FactoryProducer {

    public static AbstractFactory getFactory(boolean shape) {
        if(shape) {
            return new ShapeFactory();
        } else {
            return new ColorFactory();
        }
    }

}