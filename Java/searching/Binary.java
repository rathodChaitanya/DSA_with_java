public class Binary {

    public int searching(int arr[],int key,int r,int l){
        
        while(r>0){
            int mid = l +(r - l)/2;
            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid]>key){
                return searching(arr, key,mid-1,l);
            }
            return searching(arr, key, r, mid+1);
        }
        return -1;
    }
    public static void main(String[] args) {
        Binary binary = new Binary();
        int arr[] ={3,2,4,5,7};
        int key = 4;
        int right = arr.length-1;
        int left = 0;
        int result =binary.searching(arr,key,right,left);
        if(result == -1){
            System.out.println("key not found");
        }else{
            System.out.println("key found at "+result+" position");
        }
    }
    
}
