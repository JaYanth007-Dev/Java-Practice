package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIs {
    public static void main(String[] args) {
        // List creation
        List<String> list1 = Arrays.asList("Apple", "Banana", "Cherry", "Date", "Elderberry");
        // creating implementation
        StreamAPIInterface obj = (name) -> System.out.println(name);
        // By giving method reference implementing the method in functional interface
        list1.stream().forEach(obj::printing);

        // Creating list
        List<String> list2 = Arrays.asList("Apple", "ant", "Cherry", "Cat", "Dog", "Aeroplane");
        // Converting into the uppercase and filtering the words that starts with 'A'
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

         // reduce: Concatenate all names into a single string
        String concatenatedNames = names.stream().reduce(
            "",
            (partialString, element) -> partialString + " " + element
        );
        System.out.println("\nreduce (concatenated names):");
        System.out.println(concatenatedNames.trim());

        long count = names.stream().count();
        System.out.println("\ncount:");
        System.out.println(count);
    }
}
