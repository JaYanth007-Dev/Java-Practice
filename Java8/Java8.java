
/**
 * By using lambda function we can directly write the implementation of
 * interfaces
 * without using another class
 * 
 */
public class Java8 {
    public static void main(String[] args) {
        Java8Interface obj = (name) -> System.out.println("Hello " + name);
        obj.greet("Jayanth");
        int v = Java8Interface.add(9, 10);
        System.out.println("Sum is " + v);

    }
}
