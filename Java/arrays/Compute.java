// package arrays;

import java.util.HashMap;

public class Compute {

    public static String isSubset( long a1[], long a2[], long n, long m) {
        // int count = 0;
        // if(a1.length<=a2.length){
        //     return "No";
        // }
        
        // for(int i=0 ;i<a2.length;i++){
        //     for(int j=0 ;j<a1.length;j++){
        //         if(a2[i]==a1[j]){
        //             count++;
        //             break;
        //         }
        //     }
        // }

        // if(a2.length == count){
        //     return "Yes";
        // }
        // HashSet<Long> set = new HashSet<>();
        // for (long num : a1) {
        //     set.add(num);
        // }

        // for(long num :a2){

        //     if(!set.contains(num)){
        //         return "No";
        //     }
        // }
        // return "Yes";
          HashMap<Long, Integer> freqMap = new HashMap<>();
        
        // Count the frequency of each element in a1
        for (long num : a1) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        
        // Decrement the count of elements in a2 from the freqMap
        for (long num : a2) {
            if (!freqMap.containsKey(num) || freqMap.get(num) <= 0) {
                return "No";
            }
            freqMap.put(num, freqMap.get(num) - 1);
        }
        
        return "Yes";

    }
    public static void main(String[] args) {
        long a1[]={1, 2, 3, 4, 4, 5, 6};
        long a2[]={1, 2, 4};
        String Answer = isSubset(a1,a2,a1.length,a2.length);
        System.out.println(Answer);
    }
    
}
