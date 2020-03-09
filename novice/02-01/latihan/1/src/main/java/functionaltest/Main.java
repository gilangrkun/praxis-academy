package functionaltest;

 
class ObjectWithNonPureFunction{
    private int value = 0;

    // method ini bukan Pure Function karena mengambil nilai variabel dari variabel global
    public int add(int nextValue) {
        this.value += nextValue;
        return this.value;
    }
}

class ObjectWithPureFunction{

    // method ini Pure Function karena parameter dibuat langsung di dalam method
    public int sum(int a, int b) {
        return a + b;
    }
}



class ExternalState {
    private int initVal = 5;
    
    // ini bukan functional method karena variabel diinisialisasi di luar method
    public int sum(int a) {
       return initVal + a;
    }
}

class NoState {
    
    // ini functional method karena method diinisisalisasi di dalam method sebagai parameter 
    public int sum(int a, int b) {
       return a + b;
    }
}


// Ini functional interface karena memiliki satu abstrak method.
// Jika abstrak method lebih dari satu, maka tidak lagi menjadi functional interface
interface MyInterface {
    public void run();
}

// Ini juga functional interface karena tetap memiliki satu abstrak method
// Meskipun memiliki dua buah method lain, namun kedua method lain tsb memiliki perilaku/respon
interface MyInterface2 {
    public void run2();

    public default void doIt() {
        System.out.println("\tdefault method (ini bagian dari functional interface)");
    }

    public static void doItStatically() {
        System.out.println("\tstatic method (ini bagian dari functonal interface2)\n");
    }
    
}

public class Main implements MyInterface, MyInterface2 {

    @Override
    public void run() {
        System.out.println("\tIni adalah functional interface1");
    }

    @Override
    public void run2() {
        System.out.println("\tIni adalah functional interface2");
    }

    public static void main(String[] args) {
        
        ObjectWithNonPureFunction obj = new ObjectWithNonPureFunction();
        System.out.println("\n\tMenggunakan Non Pure Function (bukan Functional Method)");
        System.out.println("\thasil >> " + obj.add(50));

        ObjectWithPureFunction obj2 = new ObjectWithPureFunction();
        System.out.println("\n\tMenggunakan Pure Function (Functional Method)");
        System.out.println("\thasil >> " + obj2.sum(5, 7));

        ExternalState obj3 = new ExternalState();
        System.out.println("\n\tMenggunakan External State (bukan Functional Method)");
        System.out.println("\thasil >> " + obj3.sum(25));

        NoState obj4 = new NoState();
        System.out.println("\n\tNo External State (Functional Method)");
        System.out.println("\thasil >> " + obj4.sum(12, 5));

        System.out.println();

        Main obj5 = new Main();
        obj5.run();
	System.out.println();
        obj5.run2();
        obj5.doIt();
        MyInterface2.doItStatically();    
        
    }
}
