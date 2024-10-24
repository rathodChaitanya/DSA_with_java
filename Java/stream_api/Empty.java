import java.util.stream.Stream;

/**
 * Empty
 * public Stream<String> streamOf(List<String> list) {
    return list == null || list.isEmpty() ? Stream.empty() : list.stream();}

    use for if  data passing throw paramater to handle  null.
 */
public class Empty {

    public static void main(String[] args) {
        Stream<String> stream = Stream.empty();
        stream.forEach(System.out::println);
    }
}