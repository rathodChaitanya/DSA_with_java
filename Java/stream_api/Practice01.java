import java.util.stream.Stream;

public class Practice01 {
    public static void main(String[] args) {
        Stream<String> list = Stream.of("cat","mat","ball","ceat");
        list.filter(null);
        list.count();
        list.allMatch(null);
        list.findFirst();
        list.distinct();
    }
}
