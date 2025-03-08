package Java8;

import java.util.Arrays;
import java.util.List;

public class StreamAPIs {
    public static void main(String[] args) {
        List<String> values = Arrays.asList("Apple", "Banana", "Cherry", "Date", "Elderberry");
        StreamAPIInterface obj=(name)->System.out.println(name);
        values.stream().forEach(obj::printing);
    }
}
