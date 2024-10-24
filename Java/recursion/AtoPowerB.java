import java.util.*;
public class AtoPowerB {

    static int powerOf(int a, int b){
        if(b>0){
            return a*powerOf(a, b-1);
        }
        else{
            return 1;
        }
        
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter No : ");
        int a = scn.nextInt();
        System.out.println("Enter Power of No : ");
        int b = scn.nextInt();
        System.out.println(powerOf(a,b));

    }
}
