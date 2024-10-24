import java.util.*;
public class reverseNo {

    static int rev(int n){
        int t = n%10;
        int s = n/10;
        int res = t/s;
        if(s!=0)
            return t*rev(s); 
        else
            return 0;
    }

     boolean void foo(){

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int no = scn.nextInt();
        System.out.println(rev(no));
        
    }
    
}
