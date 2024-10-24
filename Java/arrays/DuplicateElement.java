import java.util.*;
public class DuplicateElement {
    
    public static ArrayList<Integer> duplicate(int arr[],int n){

        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,String> map = new HashMap<>();
        for (int key : arr) {
            if(map.containsKey(key)){
                list.add(key);
            }
        }
        if(list.size()==0){ 
            list.add(-1);
        }

        return list;

    }
    public static void main(String[] args) {
        // int arr[] = {0,3,1,2};
        int arr[] = {2,3,1,2,3};
        int n = arr.length;
        System.out.println(duplicate(arr, n));
    }
}
