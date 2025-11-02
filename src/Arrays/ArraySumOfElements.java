package Arrays;

public class ArraySumOfElements {
    public static void main(String[] args) {
        int[] nums = {2,8,9,17,15,10,21,27};
        //System.out.println(nums.length);
        double sum = 0;
        for (int i = 0; i < nums.length; i++){
            sum = sum + nums[i];
        }
        System.out.println(" Sum is " + sum);

        double average = (sum/ nums.length);
        System.out.println(" Average is " + average);
    }
}
