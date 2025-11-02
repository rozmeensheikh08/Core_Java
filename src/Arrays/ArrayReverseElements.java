package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReverseElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter Number of Elements : ");
        int size = sc.nextInt();
        int[] nums = new int[size];
        int[] t = new int[size];

        for (int i = 0 ; i<size; i++){
            System.out.print(" Enter Element " + i + " :");
            nums[i] = sc.nextInt();
            //t[i] = nums[i];
        }
        System.out.println();
        System.out.println(" Before Reverse " + Arrays.toString(nums));

        for (int j = 0; j < size; j++){
            t[j] = nums[j];
        }
        for (int a = 0; a<size; a++) {
            nums[a] = t[(t.length) - (a + 1)];
        }

        System.out.println(" After Reverse = " + Arrays.toString(nums));

        sc.close();
    }
}
