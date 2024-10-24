import java.util.ArrayList;

public class SubarraySum {

    @SuppressWarnings("unused")
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
         ArrayList<Integer> al = new ArrayList<>();
         int count=0;
         for(int i=0 ;i<n ;i++){
            for(int j=i+1;j<n;j++){
             count+=arr[i+j];
             if(count == s){
                al.add(i+1);
                al.add(j+1);
                break;
             }
             return al;
            }
         }

        return al;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,7,5};
        int N = arr.length;
        int s = 12;
        subarraySum(arr, N, s);
    }
    
}
