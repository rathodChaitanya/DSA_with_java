/*
 * Longest Common Prefix in an Array....
 * 
 * N = 4
 *  arr[] = {geeksforgeeks, geeks, geek, geezer}
 * Output: gee
 * Explanation: "gee" is the longest common prefix in all the given strings.
 */

 public class LongPrifix {

    static String prifix(String s1,String s2){
        String result ="";
        int n1 = s1.length(),n2 =s2.length();
        for(int i=0,j=0;i<=){

        }
        return result;
    }

    static String longestCommonPrifix (String arr[], int n){
        String s1 = arr[0];
        for(int i=1 ;i<n-1;i++){
            s1 = prifix(s1, arr[i]);
        }
        return s1;
    }

    public static void main(String[] args) {
        String arr[] = {"geeksforgeeks", "geeks", "geek", "geezer"};
        int n = arr.length;
        longestCommonPrifix(arr, n);
    }
 }