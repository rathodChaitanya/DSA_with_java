import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class SreamCreation {

    public static void main(String[] args) {
        List<String> departmentList = new ArrayList<>();
        departmentList.add("HR");
        departmentList.add("Techology");
        departmentList.add("Sales");
        departmentList.add("Marketing");

        Stream<String> depstream = departmentList.stream();
        // depstream.forEach(dept -> System.out.println(dept));
        depstream.parallel();
        depstream.forEach(System.out::println);
        Stream<String> sr = Stream.of("a", "b", "c");
        sr.forEach(System.out::println);

        Stream<String> dept = departmentList.parallelStream();
        dept.forEach(System.out::println);

        String[] arraywords ={"easy","byte","zerodha","grow"};
        for (String arraywords2 : arraywords) {
            System.out.println(arraywords2);
        }
        
        // arraywords.

    }

}
