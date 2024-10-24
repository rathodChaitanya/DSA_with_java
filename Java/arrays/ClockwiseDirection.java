public class ClockwiseDirection {

    public void rotate(int arr[], int n){

        int lastElement = arr[n-1];
        for(int i = n-1 ;i>0 ;i--){
            arr[i]=arr[i-1];
        }
        arr[0] = lastElement;

    }
    public static void main(String[] args) {
        ClockwiseDirection cDirection = new ClockwiseDirection();
        int arr[]={1, 2, 3, 4, 5};
        int N = arr.length;
        cDirection.rotate(arr,N);
    }
    
}




