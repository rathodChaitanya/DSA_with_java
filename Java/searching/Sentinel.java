public class Sentinel {

    int searching (int arr[],int key){

        int last = arr[arr.length-1];
        arr[arr.length-1] = key;
        int i = 0;
        while(arr[i]!= key){
            i++;
        }

        arr[arr.length-1] = last;

        if(i< arr.length -1 || last == key){
            return i;
        }  

        return -1;
    }
    public static void main(String[] args) {
        int arr[] ={3,2,4,5,7};
        int key = 9;
        Sentinel sentinel = new Sentinel();
        int result = sentinel.searching(arr,key);
        if(result == -1){
            System.out.println("key not found");
        }else{
            System.out.println("key found at "+result+" position");
        }
    }
    
}
