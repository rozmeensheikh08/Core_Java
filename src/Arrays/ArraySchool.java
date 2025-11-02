package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySchool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter Numbers of subject : ");
        int size = sc.nextInt();

        int[] marks = new int[size];
//        System.out.print(" Enter marks of Maths : ");
//        marks[0] = sc.nextInt();
//        System.out.print(" Enter marks of Hindi : ");
//        marks[1] = sc.nextInt();
//        System.out.print(" Enter marks of Physics : ");
//        marks[2] = sc.nextInt();
//        System.out.print(" Enter marks of Chemistry : ");
//        marks[3] = sc.nextInt();
//        System.out.print(" Enter marks of English : ");
//        marks[4] = sc.nextInt();
//        System.out.println();
//        System.out.print("Array = " + Arrays.toString(marks));

        double sum = 0;
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter marks of Subject "+ (i+1) + ": ");
            marks[i] = sc.nextInt();
            sum = sum + marks[i];
        }

        System.out.print("Array = " + Arrays.toString(marks));
        System.out.println();
        System.out.println(" Sum is " + sum);
            double percent = sum/size;
        System.out.println(" percentage is " + percent + "%");

//        Object[] marks = sc.tokens().toArray();
//        System.out.println(marks);
    }
}
