public class Tower_Of_Hanoi {

  static void rod(int n ,char source,char destination,char helper){

    if(n == 0 ){
        return;
    }
    rod(n-1,source,helper,destination);
    System.out.println("Move disk " + n + " from rod "
    + source + " to rod "
    + destination);
    rod(n-1,helper,destination,source);
  }

    public static void main(String[] args) {

        rod(3,'A','B','C');
        
    }
}