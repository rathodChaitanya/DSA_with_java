import java.util.ArrayList;
import java.util.List;
// import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Filter {

     private static List < Product > productsList = new ArrayList < Product > ();

    public static void main(String[] args) {

        // Adding Products
        productsList.add(new Product(1, "HP Laptop", 25000f));
        productsList.add(new Product(2, "Dell Laptop", 30000f));
        productsList.add(new Product(3, "Lenevo Laptop", 28000f));
        productsList.add(new Product(4, "Sony Laptop", 28000f));
        productsList.add(new Product(5, "Apple Laptop", 90000f));
        // With Java 8 Stream API'S
        withStreamAPI();
    }

    private static void withStreamAPI(){
        List<Float> prodList = productsList.stream()
        .filter((product)-> product.getPrice()>25000)
        .map((product)-> product.getPrice())
        .collect(Collectors.toList());
        
        prodList.forEach((price)->System.out.println(price));

    }
    
}
