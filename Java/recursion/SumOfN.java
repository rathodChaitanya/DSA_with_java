/**
 * SumOfN
 */
import java.util.*;;
public class SumOfN {

    static int sum (int n){

        if(n==1){
            return 1;
        }else{
            return n+sum(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter no : ");
        int n = scn.nextInt();
        System.out.println(SumOfN.sum(n));

    }
}