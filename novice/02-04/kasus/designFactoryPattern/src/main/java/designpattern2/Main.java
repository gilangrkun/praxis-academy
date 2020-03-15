package designpattern2;

public class Main {
    public static void main(String[] args) {
        
        // instansiasi method getFactory dari class FacrotyProducer
        AbstractFactory shape = FactoryProducer.getFactory(true);
        AbstractFactory color = FactoryProducer.getFactory(false);

        try {
            // instansiasi objek bentuk dan warna
            Shape shape1 =  shape.getShape("CIRCLE");
            Shape shape2 =  shape.getShape("RECTANGLE");
            Shape shape3 =  shape.getShape("SQUARE");
            Color color1 = color.getColor("BLUE");
            Color color2 = color.getColor("RED");
            Color color3 = color.getColor("GREEN");
            
            System.out.println("\n\tDibuat menggunakan design Factory Pattern.....\n");
            System.out.println("\tIni adalah bentuk " + shape1.draw() + " dengan warna " + color3.fill() + ".");
            System.out.println("\tIni adalah bentuk " + shape3.draw() + " dengan warna " + color2.fill() + ".");
            System.out.println("\tIni adalah bentuk " + shape2.draw() + " dengan warna " + color1.fill() + ".");
            
        } catch(NullPointerException e) {
            e.printStackTrace();
        }


    }
}