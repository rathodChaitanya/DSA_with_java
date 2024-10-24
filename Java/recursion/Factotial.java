import java.util.*;
public class Factotial {

    static int fact(int n){
        return n ==1 ? 1:n*fact(n-1);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Get factorial No : " );
        int no = scn.nextInt();
        System.out.println(fact(no));

    }
    
}
