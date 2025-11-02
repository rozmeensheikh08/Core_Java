package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter Numbers of students : ");
        int size = sc.nextInt();
        double[] height = new double[size];
        for (int i = 0; i < height.length; i++){
            System.out.print(" Enter height of student "+ (i+1) + ": ");
            height[i] = sc.nextDouble();

        }
        System.out.println();
        System.out.println(" Before sorting Array = " + Arrays.toString(height));

        Arrays.sort(height);
        System.out.println(" After Sorting Array = " + Arrays.toString(height));



        sc.close();
    }
}
