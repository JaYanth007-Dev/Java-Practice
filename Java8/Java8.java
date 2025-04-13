
/**
 * By using lambda function we can directly write the implementation of
 * interfaces
 * without using another class
 * 
 */
public class Java8 {
    public static void main(String[] args) {
        // Creating implementation of abstract method present in Java8Interface (functional Interface)
        Java8Interface obj = (name) -> System.out.println("Hello " + name);
        // calling greet method
        obj.greet("Jayanth");
        int v = Java8Interface.add(9, 10);
        System.out.println("Sum is " + v);

    }
}
