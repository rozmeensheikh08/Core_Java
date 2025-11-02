package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMaxNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter number of Elements in Array : ");
        int size = sc.nextInt();
        int[] nums = new int[size];
        for (int i = 0 ; i<size; i++){
            System.out.print(" Enter Element " + i + " :");
            nums[i] = sc.nextInt();
        }
        Arrays.sort(nums);
        System.out.println(" Maximum Number = " + nums[size-1]);
        System.out.println(" Minimum Number = " + nums[0]);


        sc.close();
    }
}
