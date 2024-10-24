// package stream_api;

import java.util.Arrays;
import java.util.List;
// import java.util.stream.Collector;
import java.util.stream.Collectors;

public class javaStreamFeature {
    public static void main(String[] args) {
        
        List<String> names = Arrays.asList("ram","sham",null,"kiran","ramesh",null);
        names.stream().filter(name -> name!=null)
        .collect(Collectors.toList());

    }
    
}
