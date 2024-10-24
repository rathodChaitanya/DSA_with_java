import java.util.*;
public class Product {

    static int prod(int a ,int b){
if(a<b){
    return prod(b, a);
}else if(b!=0){
    return a+prod(a, b-1);
}else{
    return 0;
}

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        System.out.println(prod(n, m));
    }
    
}
