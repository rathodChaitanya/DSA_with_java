import java.util.Arrays;
import java.util.stream.Stream;

/**
 * to print subset of array or to print with particuler index using sum mathmatical operation
 * @author : Chaitanya Rathod
 */
public class SteamArray {
    public static void main(String[] args) {

        String[] arr = new String[]{"a","b","c"};
        Stream<String> streamOfArray = Arrays.stream(arr);
        streamOfArray.forEach(System.out::println);

        System.out.println();

        Stream<String> selectedArray = Arrays.stream(arr,3,3);
        selectedArray.forEach(System.out::println);

        }
}
