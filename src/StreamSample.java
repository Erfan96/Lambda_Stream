import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamSample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "Amir", "Hatef", "Mehran", "Mojtaba",
                "Mohammad", "Ali", "Davood", "Reza",
                "Mohsen");

        Map<Integer, List<String>> result = list.stream().collect
                (Collectors.groupingBy(String::length));

        System.out.println(result);
    }
}
