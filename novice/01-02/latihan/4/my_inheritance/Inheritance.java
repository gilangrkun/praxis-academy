package my_inheritance;

// ini merupakan superclass / parent
class Parent {
    public String brand = "Aqua";
    public void tagLine() {
        System.out.println("Summber air su dekat..");
    }
}

// ini merupakan subclass / child
class Inheritance extends Parent {
    
    // ini merupakan inheritance
    String volume = "Galon";
    public static void main(String[] args) {

        Inheritance myAqua = new Inheritance();

        System.out.println("Saya selalu minum " + myAqua.brand + " yang dibeli dalam kemasan " + myAqua.volume + ".");
        
        System.out.print("Tag line dari Aqua adalah: ");
        myAqua.tagLine();

    }  
}