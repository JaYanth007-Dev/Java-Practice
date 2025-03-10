package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIs {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("Apple", "Banana", "Cherry", "Date", "Elderberry");
        StreamAPIInterface obj = (name) -> System.out.println(name);
        list1.stream().forEach(obj::printing);

        List<String> list2 = Arrays.asList("Apple", "ant", "Cherry", "Cat", "Dog", "Aeroplane");
        List<String> values = list2.stream().map(String::toUpperCase).filter(item -> item.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(values);

          // anyMatch: Check if any name starts with 'S'
        boolean anyStartWithS = list2.stream().anyMatch(
            name -> name.startsWith("S")
        );

        // findFirst: Find the first name
        Optional<String> firstName = list2.stream().findFirst();
        System.out.println("\nfindFirst:");
        // ---firstName.ifPresent(System.out::println);

          // allMatch: Check if all names start with 'S'
        boolean allStartWithS = list2.stream().allMatch(
            name -> name.startsWith("S")
        );
    }
}
