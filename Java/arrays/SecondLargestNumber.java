public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] nums = {1, 5, 3, 9, 7};
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                secondMax = max;
                max = nums[i];
            } else if (nums[i] > secondMax && nums[i] != max) {
                secondMax = nums[i];
            }
        }
        System.out.println("Second largest number: " + secondMax);
    }
}