package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReverseByTempVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter Number of Elements : ");
        int size = sc.nextInt();
        int[] nums = new int[size];
       int t ;

        for (int i = 0 ; i<size; i++){
            System.out.print(" Enter Element " + i + " :");
            nums[i] = sc.nextInt();
            //t[i] = nums[i];
        }
        System.out.println();
        System.out.println(" Before Reverse " + Arrays.toString(nums));

        for (int j = 0; j<size/2; j++) {
            t = nums[(nums.length) - (j + 1)];
            nums[(nums.length) - (j + 1)] = nums[j];
            nums[j] = t;
        }

        System.out.println(" After Reverse = " + Arrays.toString(nums));

        sc.close();
    }
}
