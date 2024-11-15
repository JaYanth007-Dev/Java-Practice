import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String :");
        String s = sc.nextLine();
        s = s.replaceAll("[^a-zA-Z0-9]", " ");
        s = s.replaceAll("[0-9]", " ");
        System.out.println(s);
    }
}