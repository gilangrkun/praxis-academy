import java.lang.annotation.*;

@Documented
@interface TestAnnotation {
    String Developer() default "Gilang";
    String DateOfCreate() default "01/01/2020";
}

@TestAnnotation(Developer = "Mas Kuntiarso", DateOfCreate = "05/03/2020")
public class Annotations {
    @TestAnnotation(Developer = "Mas Kuntiarso", DateOfCreate = "05/03/2020")
    void fun1() {
        System.out.println("Test method 1");
    }

    @TestAnnotation(Developer = "GRK", DateOfCreate = "05/03/2020")
    void fun2() {
        System.out.println("Test method 2");
    }

    public static void main(String[] args) {
        Annotations test = new Annotations();
        
        test.fun1();
        test.fun2();
    }
}