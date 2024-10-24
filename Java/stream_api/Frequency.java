import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Frequency {

    public static void main(String[] args) {
        String x = "Java Concept Of The Day";
        Map<Character, Long> charCountMap = x.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(charCountMap);
    }

    @Override
    public String toString() {
        return "Frequency []";
    }

}
